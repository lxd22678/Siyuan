package com.innoxyz.syuan.model;

import com.innoxyz.syuan.model.base.BaseEntity;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by lxd on 1/11/16.
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class Pager extends BaseEntity{
    private int pageNow;
    private int pageSize;
    private int totalItems;
    private int totalPages;

    private List<Record> records;
    private List<Card> cards;

    public boolean hasMore(){
        return this.pageNow < this.totalPages;
    }
}
