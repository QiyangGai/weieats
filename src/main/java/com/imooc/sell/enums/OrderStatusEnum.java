package com.imooc.sell.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {
    NEW(0, "New Order"),
    FINISHED(1, "Finished Order"),
    CANCEL(2, "Canceled Order"),
    ;
    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
