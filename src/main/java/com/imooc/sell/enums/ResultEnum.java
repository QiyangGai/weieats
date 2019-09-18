package com.imooc.sell.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PARAM_ERROR(1, "error with parameter"),

    PRODUCT_NOT_EXIST(10,"This product doesnt`t exist"),

    PRODUCT_STOCK_ERROR(11,"This product doesnt`t` have a valid stock"),

    ORDER_NOT_EXIST(12, "This oder does not exist"),

    ORDER_DETAIL_NOT_EXIST(13, "This detail of order does not exist"),

    ORDER_STATUS_ERROR(14,"Update  failed. Error with order status"),

    ORDER_UPDATE_FAILED(15,"Fail to update order"),

    ORDER_DETAIL_EMPTY(16,"This order contains no order detail"),

    ODER_PAY_STATUS_ERROR(17,"Update failed. Error with payment status"),

    CART_EMPTY(18, "Cart is empty"),

    ORDER_OWNER_ERROR(19, "Wrong openid. This order does not belong to the owner"),

    WX_MP_ERROR(20, "Wechat acoount error"),

    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
