package com.ebuytech.svc.easybuy.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by Eric3 on 2018/9/18.
 */
@Data
public class ChangeTransVO {

    private List changeTransList;

    //总页数
    private Integer totalPage;

    //总条数
    private Long totalResult;

}
