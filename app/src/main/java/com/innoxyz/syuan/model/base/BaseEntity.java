package com.innoxyz.syuan.model.base;

import com.google.gson.annotations.SerializedName;
import com.innoxyz.syuan.model.Status;

import java.util.Date;
import java.util.Properties;

import lombok.Data;

/**
 * Created by lxd on 1/11/16.
 */
@Data
public class BaseEntity {
    protected int id;

    protected Status status;

    @SerializedName("create_time")
    protected Date createTime;

    @SerializedName("updateTime")
    protected Date updateTime;

}
