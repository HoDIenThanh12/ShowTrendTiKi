package com.example.tiki.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tiki.module.entity.ItemsItem;
import com.example.tiki.module.entity.MetaData;
import com.example.tiki.module.entity.Response;
import com.example.tiki.retofits.RetrofitProduct;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class ListProductViewModule extends ViewModel {
    private MutableLiveData<List<ItemsItem>> moviesList;

    public  ListProductViewModule(){
        moviesList=new MutableLiveData<>();
    }
    public MutableLiveData<List<ItemsItem>> getLisst(){
        return moviesList;
    }

    public void makeAPI(){
        RetrofitProduct retrofitProduct= RetrofitProduct.getInstance();
        Call<Response> call= retrofitProduct.getApiProduct()
                .getCategory(0,20);
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Response r=response.body();
                moviesList.postValue(r.getData().getMetaData().getListItems());
                List<ItemsItem> l=r.getData().getMetaData().getListItems();
                for(int i=0;i<l.size();i++){

                }

            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
    }

}
