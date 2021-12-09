package com.example.tiki.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
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
import com.example.tiki.retofits.RetrofitProduct;
import com.example.tiki.view.viewmau.view2.Response;

import java.util.ArrayList;
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

    private RecyclerView rcvlUer;
    private AdapperUser adapperUser;
    private AdapperProduct adapperProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);
        //khởi tạo
        rcvlUer = findViewById(R.id.rcv_user);
        //thực hiện nội dung ở đâu
        //adapperUser=new AdapperUser(this);
        adapperProduct=new AdapperProduct(this);

        //set layout
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvlUer.setLayoutManager(linearLayoutManager);

        //gán data
       // adapperProduct.setData(getList());
        //rcvlUer.setAdapter(adapperProduct);

        //adapperUser.setData(getList());
        //rcvlUer.setAdapter(adapperUser);

        if(getList()!=null)
            tview=findViewById(R.id.tv);
        //getData();
        getListItemItem();
    }

    private  void getData() {

    }

//    private void getData(){
//        Call<Response> call = RetrofitProduct.getInstance().getApiProduct()
//                .getCategory(0,20);
//        call.enqueue(new Callback<Response>() {
    private List<User> getList(){
        List<User> l =new ArrayList<>();
        l.add(new User("thanh","2324", R.drawable.cho));
        l.add(new User("thanh","2324", R.drawable.cho));
        l.add(new User("thanh","2324", R.drawable.cho));
        l.add(new User("thanh","2324", R.drawable.cho));

         //List<ItemsItem> lI=getListItemItem();
         //Log.d(TAG, "dữ liệu sau lấy-> " + lI.size());
        return l;
    }

    public void getListItemItem(){
        //gán list product
        //String po;
        RetrofitProduct retrofitProduct = RetrofitProduct.getInstance();
        Call<com.example.tiki.view.viewmau.view2.Response> call = retrofitProduct.getApiProduct()
                .getCategory(0,20);
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

                Response r =response.body();
                //metaData.postValue(getData().getMetaData());
                List<ItemsItem> temp =r.getData().getMetaData().getListItems();
                //lItems =  r.getData().getMetaData().getListItems();
                Log.d(TAG,"sussces----> thành công!");
                //po=r.getData().getMetaData().getListItems().get(0).getTitle();
                Log.d(TAG,"ListItmes----> "+temp);
                Log.d(TAG,"more_liss-nh----> "+temp.get(0).getTitle());
                Log.d(TAG,"Stastus----> "+r.getStatus());
                Log.d(TAG,"type----> "+r.getData().getMetaData().getType());
                Log.d(TAG,"more_link_text----> "+r.getData().getMetaData().getMoreLinkText());
                Log.d(TAG,"more_link----> "+r.getData().getMetaData().getMoreLink());
                for(ItemsItem i :temp){
                    lItems.add(i);
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Log.d(TAG,"fail---->"+t);
            }
        });
        //Log.d(TAG,"fail---->"+lItems.get(0).getTitle());
//                .enqueue(new Callback<AllData>() {

//            @Override
//            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
//                Log.d(TAG,"sussces---->");
//
//                Response r =response.body();
//                List<ItemsItem> lsItem = r.getData().getMetaData().getListItems();
//                //lsItem.postValue();
//                Log.d(TAG,"ListItmes----> "+lsItem.get(0).getTitle());
//                Log.d(TAG,"Stastus----> "+r.getStatus());
//                Log.d(TAG,"type----> "+r.getData().getMetaData());
//                Log.d(TAG,"more_link_text----> "+r.getData().getMetaData().getMoreLinkText());
//                Log.d(TAG,"more_linh----> "+r.getData().getMetaData().getMoreLink());
//            }
//
//            @Override
//            public void onFailure(Call<Response> call, Throwable t) {
//                Log.d(TAG,"fail---->"+t);
//            }
//        });

//
////                .enqueue(new Callback<AllData>() {
////            @Override
////            public void onResponse(Call<AllData> call, Response<AllData> response) {
////                Toast.makeText(getApplicationContext(), "-----thành công", Toast.LENGTH_LONG).show();
////                Log.d(TAG,"sussces---->"+response.toString());
////                AllData allData = response.body();
////                if(allData!=null ){
////                    Log.d(TAG,"sussces---->");
////                }
////            }
////
////            @Override
////            public void onFailure(Call<AllData> call, Throwable t) {
////                Log.d(TAG,"fail---->"+t);
////            }
////        });
//
//    }

        //return arrayList;
        //return lItems;
    }

}