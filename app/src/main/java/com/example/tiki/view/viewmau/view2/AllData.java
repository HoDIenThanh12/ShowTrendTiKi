package com.example.tiki.view.viewmau.view2;

import com.example.tiki.module.entity.DataItem;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllData {

	@SerializedName("next_page")
	private String nextPage;

	@SerializedName("data")
	private List<DataItem> data;

    @SerializedName("meta_data")
    private MetaData metaData;

	public String getNextPage(){
		return nextPage;
	}

	public List<DataItem> getData(){
		return data;
	}

    public AllData(MetaData metaData) {
        this.metaData = metaData;
    }

    public MetaData getMetaData(){
        return metaData;
    }

}
