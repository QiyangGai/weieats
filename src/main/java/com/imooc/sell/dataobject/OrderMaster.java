package com.imooc.sell.dataobject;

import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /** order_id. */
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** pay_status, 0 rep haven`t pay. */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** create_time. */
    private Date createTime;

    /** update_time. */
    private Date updateTime;

}
