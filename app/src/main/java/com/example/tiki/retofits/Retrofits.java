package com.example.tiki.retofits;

import com.example.tiki.view.viewmau.jsonAPI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofits {
    private com.example.tiki.view.viewmau.jsonAPI jsonAPI;

    private static Retrofits instance =null;

    private Retrofits(){
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(jsonAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
                jsonAPI = retrofit.create(com.example.tiki.view.viewmau.jsonAPI.class);

    }


    public static synchronized Retrofits getInstance() {
        if (instance == null) {
            instance = new Retrofits();
        }
        return instance;
    }

    public jsonAPI getJsonAPI() {
        return jsonAPI;
    }
}
