package com.example.tiki.module.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemsItem{

	@SerializedName("images")
	private List<String> images;

	@SerializedName("category_id")
	private int categoryId;

	@SerializedName("title")
	private String title;

	public void setImages(List<String> images) {
		this.images = images;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getImages(){
		return images;
	}

	public int getCategoryId(){
		return categoryId;
	}

	public String getTitle(){
		return title;
	}
}