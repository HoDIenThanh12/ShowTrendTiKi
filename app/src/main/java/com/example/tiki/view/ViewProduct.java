package com.example.tiki.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.example.tiki.R;
import com.example.tiki.module.entity.ItemsItem;
import com.example.tiki.retofits.RetrofitProduct;
import com.example.tiki.view.viewmau.view2.Response;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class ViewProduct extends AppCompatActivity {
    private final String TAG=getClass().getSimpleName();
    ListView list;
    TextView tview;

    //private Adap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);

        tview=findViewById(R.id.tv);
        getData();
    }
    private  void getData() {

    }

//    private void getData(){
//        Call<Response> call = RetrofitProduct.getInstance().getApiProduct()
//                .getCategory(0,20);
//        call.enqueue(new Callback<Response>() {
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
}