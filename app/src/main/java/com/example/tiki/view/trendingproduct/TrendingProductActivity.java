package com.example.tiki.view.trendingproduct;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

//import com.example.android.tiki_trending.R;
//import com.example.android.tiki_trending.databinding.ActivityTrendingProductBinding;
//import com.example.android.tiki_trending.view.detailtrending.DetailTrendingProductActivity;
//import com.example.android.tiki_trending.view.trendingproduct.adapter.TrendingProductAdapter;
import com.google.gson.Gson;


public class TrendingProductActivity extends AppCompatActivity {
//    ActivityTrendingProductBinding binding;
//    com.example.android.tiki_trending.view.trendingproduct.TrendingProductViewModel viewModel;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_trending_product);
//        viewModel = new ViewModelProvider(this).get(com.example.android.tiki_trending.view.trendingproduct.TrendingProductViewModel.class);
//        viewModel.registerSwipeToRefreshLayout(binding.swipeRefreshTrendingProduct);
//        binding.setViewModel(viewModel);
//        binding.setLifecycleOwner(this);
//        this.getLifecycle().addObserver(viewModel);
//        setTrendingProductListAdapter();
//    }


//    private void setTrendingProductListAdapter() {
//        binding.categoryTrendingProduct.setLayoutManager(new GridLayoutManager(this, 2));
//        viewModel.getCategories().observe(this, categoryModels -> {
//            TrendingProductAdapter adapter = new TrendingProductAdapter(categoryModels, item -> {
//                Gson gson = new Gson();
//                String itemJson = gson.toJson(item);
//                Intent intent = new Intent(this, DetailTrendingProductActivity.class);
//                intent.putExtra("category", itemJson);
//                startActivity(intent);
//            });
//            binding.categoryTrendingProduct.setAdapter(adapter);
//        });
//    }


}
