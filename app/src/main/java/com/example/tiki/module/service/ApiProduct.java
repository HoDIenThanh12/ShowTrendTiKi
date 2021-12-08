package com.example.tiki.module.service;

import com.example.tiki.view.viewmau.view2.Response;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiProduct {
    //https://api.tiki.vn/shopping-trend/api/trendings/hub?cursor=0&limit=20
    static String BASE_URL="https://api.tiki.vn/shopping-trend/api/trendings/";

    @GET("hub?")
    Call<Response> getCategory(
            @Query("cursor") int cursor,
            @Query("limit") int limit);
}
