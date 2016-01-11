package com.innoxyz.syuan.model;

import com.google.gson.annotations.SerializedName;
import com.innoxyz.syuan.model.base.BaseEntity;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by lxd on 1/11/16.
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class Bill extends BaseEntity {
    public static final String TAG = Bill.class.getSimpleName();

    @SerializedName("library_id")
    private int libraryId;

    private Library library;

    @SerializedName("donor_id")
    private int donorId;

    private User donor;

    private String remark;

    private List<Book> books;
}
