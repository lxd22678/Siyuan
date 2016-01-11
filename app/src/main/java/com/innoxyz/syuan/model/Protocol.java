package com.innoxyz.syuan.model;

import com.innoxyz.syuan.model.base.BaseEntity;


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by lxd on 1/11/16.
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class Protocol extends BaseEntity {

    private Pager pager;
    private String message;

    private Type type;

    private User user;

    private Bill bill;

    private Book book;

    private Record record;

    private FileEntity file;

    public enum Type{
        NORMAL,
        LOGIN,
        PROFILE_LACK
    }

    public boolean isOk(){
        return Status.OK==this.status;
    }
}
