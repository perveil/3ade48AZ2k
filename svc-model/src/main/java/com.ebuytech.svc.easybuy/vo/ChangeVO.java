package com.ebuytech.svc.easybuy.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by Eric3 on 2018/9/15.
 */
@Data public class ChangeVO {

    private List changeList;

    private Integer totalPage;

    private Long totalResult;
}
