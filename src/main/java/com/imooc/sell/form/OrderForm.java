package com.imooc.sell.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class OrderForm {
    // buyer name
    @NotEmpty(message = "Mame cannot be blank")
    private  String name;
    //buyer phone number
    @NotEmpty(message = "Phone number cannot be blank")
    private String  phone;
    //buyer address
    @NotEmpty(message = "Address cannot be blank")
    private String address;
    //buyer openid
    @NotEmpty(message = "openid cannot be blank")
    private String openid;
    //Cart
    @NotEmpty(message = "Cart cannot be empty")
    private String items;
}
