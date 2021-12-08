package com.example.tiki.view.trendingproduct.model;

import com.example.tiki.module.entity.ItemsItem;

public class CategoryModel {
    private int cursor = 0;
    private ItemsItem item;

    public CategoryModel(int cursor, ItemsItem item) {
        this.cursor = cursor;
        this.item = item;
    }

    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    public ItemsItem getItem() {
        return item;
    }

    public void setItem(ItemsItem item) {
        this.item = item;
    }
}