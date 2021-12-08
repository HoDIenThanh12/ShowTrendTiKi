package com.example.tiki.view.trendingproduct;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.tiki.module.entity.ItemsItem;
import com.example.tiki.module.entity.MetaData;
import com.example.tiki.module.reponsiteri.TrendingProductRepository;
import com.example.tiki.view.trendingproduct.model.CategoryModel;
import com.example.tiki.module.entity.MetaData;

import java.util.ArrayList;
import java.util.List;

public class TrendingProductViewModel extends ViewModel implements LifecycleObserver {
    private boolean isLoaded = false;
    private MutableLiveData<Boolean> isLoading = new MutableLiveData<>(true);
    private MutableLiveData<MetaData> metaData = new MutableLiveData<>();
    private MutableLiveData<List<CategoryModel>> categories = new MutableLiveData<>();


//    @OnLifecycleEvent(Lifecycle.Event.ON_START)
//    public void onStart() {
//        if(isLoaded == false) {
//            loadData(0, 20);
//            isLoaded = true;
//        }
//    }

//    public void loadData(int cursor, int limit) {
//        isLoading.setValue(true);
//        TrendingProductRepository productRepository = new TrendingProductRepository();
//        productRepository.getCategory(cursor, limit, (data) -> {
//            if (data == null) return;
//            metaData.postValue(data.getData().getMetaData());
//            List<CategoryModel> categoryModels = new ArrayList<>();
//
//            List<ItemsItem> itemsItems = data.getData().getMetaData().getItems();
//            if (itemsItems == null || itemsItems.size() == 0) return;
//            for (int i = 0; i < itemsItems.size(); i++) {
//                categoryModels.add(new CategoryModel(
//                        0, itemsItems.get(i)
//                ));
//            }
//            categories.postValue(categoryModels);
//            isLoading.setValue(false);
//            System.out.println(categoryModels.size());
//        });
//    }

//    public MutableLiveData<Boolean> getIsLoading() {
//        return isLoading;
//    }
//
//    public MutableLiveData<MetaData> getMetaData() {
//        return metaData;
//    }
//
//    public MutableLiveData<List<CategoryModel>> getCategories() {
//        return categories;
//    }
//
//
//    public void registerSwipeToRefreshLayout(SwipeRefreshLayout swipeRefreshLayout) {
//        swipeRefreshLayout.setOnRefreshListener(() -> {
//            loadData(0, 20);
//            swipeRefreshLayout.setRefreshing(false);
//        });
//    }
}


