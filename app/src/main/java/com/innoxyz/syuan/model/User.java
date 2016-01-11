package com.innoxyz.syuan.model;

import com.google.gson.annotations.SerializedName;
import com.innoxyz.syuan.model.base.BaseEntity;

import java.util.Locale;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by lxd on 1/11/16.
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class User extends BaseEntity {
    public static final String TAG = User.class.getSimpleName();

    private String username;
    private String avatar;
    private String name;
    private String password;

    private Role role;

    @SerializedName("library_id")
    private Long libraryId;

    private Library library;

    private String gender;

    private String email;

    private String phone;

    @SerializedName("card_id")
    private String cardId;

    private String address;

    private String province;

    private String city;

    private String district;

    private String street;
    private String community;

    private String introduction;

    public enum Role{
        ADMIN,
        USER,
        MANAGER
    }
}
