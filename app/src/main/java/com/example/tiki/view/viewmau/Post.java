package com.example.tiki.view.viewmau;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int useId;

//    @SerializedName("body")
    private int id;

//    @SerializedName("body")
    private String title;

    @SerializedName("body")
    private String text;

    public int getUseId() {
        return useId;
    }

    public void setUseId(int useId) {
        this.useId = useId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
