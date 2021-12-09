package com.example.tiki.viewmodule;

import androidx.databinding.BaseObservable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tiki.module.entity.ItemsItem;

import java.util.List;

public class ProductViewModule extends ViewModel {
    private MutableLiveData<List<ItemsItem>> mListItems;

}
