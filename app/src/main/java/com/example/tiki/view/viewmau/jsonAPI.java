package com.example.tiki.view.viewmau;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface jsonAPI {
    String BASE_URL= "http://jsonplaceholder.typicode.com/";
    @GET("posts")
    Call<List<Post>> getPost();
}
