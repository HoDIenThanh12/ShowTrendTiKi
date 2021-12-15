package com.example.tiki.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.example.tiki.R;
import com.example.tiki.adapper.AdapperProduct;
import com.example.tiki.adapper.AdapperUser;
import com.example.tiki.adapper.User;
import com.example.tiki.module.entity.ItemsItem;
import com.example.tiki.module.entity.MetaData;
import com.example.tiki.module.entity.Response;
import com.example.tiki.retofits.RetrofitProduct;
import com.example.tiki.viewmodule.ProductViewModule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;

public class ViewProduct extends AppCompatActivity {
    private final String TAG=getClass().getSimpleName();
    ListView list;
    TextView tview;
    private MutableLiveData<MetaData> metaData = new MutableLiveData<>();
    private List<ItemsItem> lItems= new ArrayList<>();
    private List<ItemsItem> lItem1=new ArrayList<>();

    private RecyclerView rcvlUer;


    private RecyclerView rcvProduct;
    private AdapperUser adapperUser;
    private AdapperProduct adapperProduct;
    private ProductViewModule productViewModule;
    private boolean temp=false;
    //private  ActivityTrendingProductBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);

        rcvProduct=findViewById(R.id.rcv_product);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        adapperProduct= new AdapperProduct(this, lItem1,itemsItem -> {} );
//        //khởi tạo
        rcvProduct.setLayoutManager(linearLayoutManager);
        productViewModule=new ViewModelProvider(this).get(ProductViewModule.class);
        productViewModule.getmListItems().observe(this, new Observer<List<ItemsItem>>() {
            @Override
            public void onChanged(List<ItemsItem> itemsItems) {
                adapperProduct =new AdapperProduct(itemsItems);
                rcvProduct.setAdapter(adapperProduct);
            }
        });
        //rcvlUer = findViewById(R.id.rcv_user);
        //thực hiện nội dung ở đâu
        //adapperUser=new AdapperUser(this);
        //adapperProduct=new AdapperProduct(this);

        //set layout
        //rcvlUer.setLayoutManager(linearLayoutManager);

        //gán data
       // adapperProduct.setData(getList());
        //rcvlUer.setAdapter(adapperProduct);

        //adapperUser.setData(getList());
        //rcvlUer.setAdapter(adapperUser);

        //getListItemItem();
        //Log.d(TAG,"sussces----> sau gán list: " +temp);
    }


    public void getListItemItem(){
        //gán list product
        //String po;
        RetrofitProduct retrofitProduct = RetrofitProduct.getInstance();
        Call<Response> call = retrofitProduct.getApiProduct().getCategory(0,20);
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                if (response.isSuccessful()) {
                    Response r =response.body();
                    temp=true;
                    //metaData.postValue(getData().getMetaData());
                    List<ItemsItem> temp1 =r.getAllData().getMetaData().getListItems();
                    //lItems =  r.getData().getMetaData().getListItems();
                    Log.d(TAG,"sussces----> thành công!");
                    //po=r.getData().getMetaData().getListItems().get(0).getTitle();
                    Log.d(TAG,"ListItmes----> "+temp1.size());
                    Log.d(TAG,"more_liss-nh----> "+temp1.get(0).getTitle());
                    Log.d(TAG,"Stastus----> "+r.getStatus());
                    Response r1 =response.body();
                    printProduct(r1.getAllData().getMetaData().getListItems());
                    Collections.reverse((List<?>) r);
                }
            }
            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Log.d(TAG,"fail---->"+t);
            }

        });
        Log.d(TAG,"sau gán 2 ---->"+temp);
    }

    public void printProduct(List<ItemsItem> ls){
        lItem1=ls;
        Log.d("->>>> ",""+ls.size());
        int j=0;
        for (ItemsItem i: ls){
            //lItem1.add(i);
            j++;
            Log.d("->>>> ",""+i.toString());
            if(j==ls.size())
                temp=true;
        }

        //adapperProduct.setData(lItem1);
        Log.d("độ dài list ->>>> ",""+lItem1.size());
    }
}