package com.hf;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class OrdersItem {
    private Long id;

    private Long itemId;

    private Long goodsId;

    private Long orderId;

    private String title;

    private BigDecimal price;

    private Integer num;

    private BigDecimal totalFee;

    private String picPath;

    private String sellerId;

}