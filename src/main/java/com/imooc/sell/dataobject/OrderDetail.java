package com.imooc.sell.dataobject;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;

    /** order_id. */
    private String orderId;

    /** product_id. */
    private String productId;

    /** product_name. */
    private String productName;

    /** product_price. */
    private BigDecimal productPrice;

    /** product_quantity. */
    private Integer productQuantity;

    /** product_icon. */
    private String productIcon;
}
