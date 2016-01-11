package com.innoxyz.syuan.model;

import com.google.gson.annotations.SerializedName;
import com.innoxyz.syuan.model.base.BaseEntity;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by lxd on 1/11/16.
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class Record extends BaseEntity{
    public static final String TAG = Record.class.getSimpleName();

    @SerializedName("library_id")
    private int libraryId;

    private Library library;

    @SerializedName("card_id")
    private int cardId;

    private Card card;
    @SerializedName("book_id")
    private int bookId;
    private Book book;

    @SerializedName("due_time")
    private Date dueTime;

}
