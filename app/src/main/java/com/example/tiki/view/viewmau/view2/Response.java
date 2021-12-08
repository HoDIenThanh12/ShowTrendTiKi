package com.example.tiki.view.viewmau.view2;

import com.google.gson.annotations.SerializedName;

public class Response {
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
