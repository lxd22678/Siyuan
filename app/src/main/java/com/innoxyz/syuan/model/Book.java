package com.innoxyz.syuan.model;

import com.google.gson.annotations.SerializedName;
import com.innoxyz.syuan.model.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by lxd on 1/11/16.
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class Book extends BaseEntity {
    public static final String TAG = Book.class.getSimpleName();

    public static final String NO_TAG = TAG+"No";

    //图书馆中唯一标识
    public String no;

    @SerializedName("library_id")
    private int libraryId;

    private Library library;

    @SerializedName("bill_id")
    private int billId;

    private Bill bill;

    @SerializedName("donor_id")
    private int donorId;

    private String title;

    private String subtitle;

    private String author;

    private String tags;

    @SerializedName("origin_title")
    private String originTitle;

    private String image;

    @SerializedName("large_image")
    private String largeImage;

    @SerializedName("medium_image")
    private String mediumImage;

    @SerializedName("small_image")
    private String smallImage;

    private String translator;

    private String pages;

    @SerializedName("douban_url")
    private String doubanUrl;

    private String pubdate;

    private String publisher;

    private String isbn13;

    private String isbn10;

    @SerializedName("author_introduction")
    private String authorIntroduction;

    private String summary;

    private String price;
}
