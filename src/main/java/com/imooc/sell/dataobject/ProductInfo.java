package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;

/*
 *
 *
 * product
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId;

    /** product_name. */
    private String productName;

    /** product_price. */
    private BigDecimal productPrice;

    /** product_stock. */
    private Integer productStock;

    /** product_description. */
    private String productDescription;

    /** picture. */
    private String productIcon;

    /** status, normal: 0 out of stock: 1. */
    private Integer productStatus;

    /** category_type. */
    private Integer categoryType;



}
