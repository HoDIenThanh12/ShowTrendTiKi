package com.example.tiki.view.viewmau.view2;

import com.example.tiki.module.entity.ItemsItem;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class MetaData {
    @SerializedName("type")
    private String type;

    @SerializedName("more_link_text")
    private String moreLinkText;

    @SerializedName("more_link")
    private String moreLink;


    @SerializedName("title")
    private String title;

    @SerializedName("sub_title")
    private String subTitle;

    @SerializedName("background_image")
    private String backgroundImage;


    @SerializedName("title_icon")
    private TitleIcon titleIcon;

    public MetaData(String type, String moreLinkText, String moreLink, String title, String subTitle, String backgroundImage, TitleIcon titleIcon) {
        this.type = type;
        this.moreLinkText = moreLinkText;
        this.moreLink = moreLink;
        this.title = title;
        this.subTitle = subTitle;
        this.backgroundImage = backgroundImage;
        this.titleIcon = titleIcon;
    }


	@SerializedName("items")
	private ArrayList<ItemsItem> ListItems;

    public String getBackgroundImage(){
        return backgroundImage;
    }

    public String getSubTitle(){
        return subTitle;
    }

    public String getMoreLink(){
        return moreLink;
    }

    public TitleIcon getTitleIcon(){
        return titleIcon;
    }

    public String getType(){
        return type;
    }

    public String getTitle(){
        return title;
    }

    public String getMoreLinkText(){
        return moreLinkText;
    }

	public ArrayList<ItemsItem> getListItems(){
		return ListItems;
	}
}
