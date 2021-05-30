package com.cdp.utils;

import java.io.Serializable;

public class Paging implements Serializable {
    private Integer page;
    private Integer limit;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Paging{" +
                "page=" + page +
                ", limit=" + limit +
                '}';
    }
}
