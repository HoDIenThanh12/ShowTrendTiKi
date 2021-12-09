package com.example.tiki.adapper;

public class User {
    private String _nameP;
    private String _category_id;
    private int _image;

    public User(String _nameP, String _category_id, int _image) {
        this._nameP = _nameP;
        this._category_id = _category_id;
        this._image = _image;
    }

    public String get_nameP() {
        return _nameP;
    }

    public void set_nameP(String _nameP) {
        this._nameP = _nameP;
    }

    public String get_category_id() {
        return _category_id;
    }

    public void set_category_id(String _category_id) {
        this._category_id = _category_id;
    }

    public int get_image() {
        return _image;
    }

    public void set_image(int _image) {
        this._image = _image;
    }
}
