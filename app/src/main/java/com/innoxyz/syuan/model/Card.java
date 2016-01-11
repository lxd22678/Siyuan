package com.innoxyz.syuan.model;

import com.google.gson.annotations.SerializedName;
import com.innoxyz.syuan.model.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by lxd on 1/11/16.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Card extends BaseEntity{

    public static final String TAG = Card.class.getSimpleName();

    public static final String NO_TAG=TAG+"No";

    @SerializedName("library_id")
    private int libraryId;

    private Library library;

    @SerializedName("user_id")
    private int userId;

    private User user;

    private String no;

    private String name;

    private String address;

    private String gender;

    @SerializedName("id_card_image")
    private String idCardImage;

    private String photo;

    private String remark;
}
