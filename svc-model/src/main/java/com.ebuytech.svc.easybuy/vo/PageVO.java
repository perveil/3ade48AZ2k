package com.ebuytech.svc.easybuy.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by HYS on 2018/9/15.
 */
@Data
public class PageVO<T> {

    List<T> list;

    //总页数
    private Integer totalPage;

    //总条数
    private Long totalResult;
}
