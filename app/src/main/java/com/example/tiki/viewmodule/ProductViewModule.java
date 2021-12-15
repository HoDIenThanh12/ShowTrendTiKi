package com.example.tiki.viewmodule;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tiki.module.entity.ItemsItem;
import com.example.tiki.module.entity.Response;
import com.example.tiki.module.service.ApiProduct;
import com.example.tiki.retofits.RetrofitProduct;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.http.PUT;

public class ProductViewModule extends ViewModel {
    private final String TAG=getClass().getSimpleName();

    private MutableLiveData<List<CategoryModel>> categories = new MutableLiveData<>();
    private MutableLiveData<List<ItemsItem>> mListLiveDataItems;
    private List<ItemsItem> lItems;

    public ProductViewModule() {
        super();
        mListLiveDataItems=new MutableLiveData<>();
        InitData();
    }

    public ProductViewModule(List<ItemsItem> lItems) {
        this.lItems = lItems;
    }

    public ProductViewModule(MutableLiveData<List<ItemsItem>> mListItems) {
        this.mListLiveDataItems = mListItems;

    }

    public MutableLiveData<List<ItemsItem>> getmListItems() {
        return mListLiveDataItems;
    }

    public List<ItemsItem> getlItems() {
        return lItems;
    }
    public void InitData(){
        MakeAPI();
        //lItems=new ArrayList<>();
//        List<String> lString=new ArrayList<>();
//        lString.add("123");
//        lItems.add(new ItemsItem(123,"thanh"));
//        lItems.add(new ItemsItem(123,"thanh"));
//        lItems.add(new ItemsItem(123,"thanh"));
//        lItems.add(new ItemsItem(123,"thanh"));

        //mListLiveDataItems.setValue(lItems);
        //Log.d("sau khi gan->>>> ","kich thưc: "+getlItems().size());
    }
    public void AddProduct(){
        //lItems.add(ItemsItem);
    }
    public void MakeAPI(){
        //MutableLiveData<List<ItemsItem>> mListLiveDataItems2;
        RetrofitProduct retrofitProduct = RetrofitProduct.getInstance();
        Call<Response> call = retrofitProduct.getApiProduct().getCategory(0,20);
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Response r =response.body();
                List<ItemsItem> temp1 =r.getAllData().getMetaData().getListItems();
                setlItems(temp1);
                printProduct(r.getAllData().getMetaData().getListItems());
                Log.d(TAG,"sussces----> thành công!");
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
    }
    public void printProduct(List<ItemsItem> ls){
//        for (ItemsItem i: ls){
//            Log.d("->>>> ",""+i.toString());
//            Log.d("->>>> ",""+i.getImages().get(0));
//            lItems.add(i);
//        }
        setlItems(lItems);
        mListLiveDataItems.setValue(lItems);
        Log.d("sau khi gan->>>> ","kich thưc: "+getlItems().size());
    }

    public LiveData<List<ItemsItem>> MakeAPIListItems(){
        MutableLiveData<List<ItemsItem>> mListLiveDataItems2=new MutableLiveData<>();
        RetrofitProduct retrofitProduct = RetrofitProduct.getInstance();
        Call<Response> call = retrofitProduct.getApiProduct().getCategory(0,20);
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Response r =response.body();
                List<ItemsItem> temp1 =r.getAllData().getMetaData().getListItems();
                if(response.body()!=null)
                    mListLiveDataItems2.setValue(temp1);
                printProduct(r.getAllData().getMetaData().getListItems());
                Log.d(TAG,"sussces----> thành công!");

            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
        return mListLiveDataItems2;
    }

    public MutableLiveData<List<CategoryModel>> getCategories() {
        return categories;
    }

    public void setCategories(MutableLiveData<List<CategoryModel>> categories) {
        this.categories = categories;
    }

    public MutableLiveData<List<ItemsItem>> getmListLiveDataItems() {
        return mListLiveDataItems;
    }

    public void setmListLiveDataItems(MutableLiveData<List<ItemsItem>> mListLiveDataItems) {
        this.mListLiveDataItems = mListLiveDataItems;
    }

    public void setlItems(List<ItemsItem> lItems) {
        this.lItems = lItems;
    }
}
