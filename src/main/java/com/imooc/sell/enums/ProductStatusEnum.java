package com.imooc.sell.enums;

import lombok.Getter;

/**
 * Product type
 */

@Getter
public enum ProductStatusEnum {
    UP(0, "In Stock"),
    DOWN(1, "Out Of Stock");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
