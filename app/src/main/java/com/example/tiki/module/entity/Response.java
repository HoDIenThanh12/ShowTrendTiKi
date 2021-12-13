package com.example.tiki.module.entity;

import com.google.gson.annotations.SerializedName;

public class Response123 {

	@SerializedName("data")
	private AllData data;

	@SerializedName("status")
	private int status;

	public AllData getData(){
		return data;
	}

	public int getStatus(){
		return status;
	}


}