package com.innoxyz.syuan.model;

import com.google.gson.annotations.SerializedName;
import com.innoxyz.syuan.model.base.BaseEntity;
import com.innoxyz.syuan.network.URL;


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by lxd on 1/11/16.
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class FileEntity extends BaseEntity {
    public static final String TAG = FileEntity.class.getSimpleName();

    private int uid;

    @SerializedName("file_id")
    private String fileId;
    private String type;

    public String getUrl(){
        return URL.FILE_GET+"/id/"+fileId;
    }
}
