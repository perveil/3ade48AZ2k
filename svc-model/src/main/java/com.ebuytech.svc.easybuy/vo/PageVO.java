package com.ebuytech.svc.easybuy.vo;

import lombok.Data;

import java.util.List;

@Data
public class PageVo<E> {
    private List<E> elements;

    private int totalPage;

    private int totalResult;
}
