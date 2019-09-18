package com.imooc.sell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.sell.Utils.serializer.Date2LongSerializer;
import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
//JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    /** order_id. */
    private String orderId;

    /** buyer_name. */
    private String buyerName;

    /** buyer_phone. */
    private String buyerPhone;

    /** buyer_address. */
    private String buyerAddress;

    /** buyer_openid. */
    private String buyerOpenid;

    /** order_amount. */
    private BigDecimal orderAmount;

    /** order_status, 0 rep new order. */
    private Integer orderStatus;

    /** pay_status, 0 rep haven`t pay. */
    private Integer payStatus;

    /** create_time. */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /** update_time. */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList ;
}
