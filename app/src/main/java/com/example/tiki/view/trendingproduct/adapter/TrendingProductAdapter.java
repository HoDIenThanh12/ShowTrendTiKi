package com.example.tiki.view.trendingproduct.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import com.example.android.tiki_trending.databinding.ItemCardTrendingProductBinding;
import com.example.tiki.view.trendingproduct.model.CategoryModel;

import java.util.List;

//public class TrendingProductAdapter extends RecyclerView.Adapter<TrendingProductAdapter.ViewHolder> {
//    private List<CategoryModel> items;
//    OnClickListener onClickListener;
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
//        ItemCardTrendingProductBinding binding = ItemCardTrendingProductBinding.inflate(layoutInflater, parent, false);
//        return new ViewHolder(binding);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        CategoryModel item = items.get(position);
//        holder.bind(item);
//    }
//
//    public TrendingProductAdapter(List<CategoryModel> items, OnClickListener onClickListener) {
//        this.items = items;
//        this.onClickListener = onClickListener;
//    }
//
//    @Override
//    public int getItemCount() {
//        return items.size();
//    }
//
//    class ViewHolder extends RecyclerView.ViewHolder {
//        private ItemCardTrendingProductBinding binding;
//
//        public ViewHolder(ItemCardTrendingProductBinding itemBinding) {
//            super(itemBinding.getRoot());
//            this.binding = itemBinding;
//        }
//
//        public void bind(CategoryModel categoryModel) {
//            this.binding.setItems(categoryModel.getItem());
//            this.binding.card.setOnClickListener(view -> onClickListener.invoke(categoryModel));
//        }
//    }
//
//    public interface OnClickListener {
//        void invoke(CategoryModel item);
//    }
//}
