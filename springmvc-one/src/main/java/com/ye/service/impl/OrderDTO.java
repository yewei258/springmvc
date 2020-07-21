package com.ye.service.impl;

import java.math.BigDecimal;

public class OrderDTO {
    private String code;

    private BigDecimal price;

    /**
     * 订单类型
     * 1.普通订单
     * 2.团体订单
     * 3.促销订单
     */
    private String orderType;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
