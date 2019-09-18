package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {


    /** Create order. */
    OrderDTO create(OrderDTO orderDTO);

    /** Query single order . */
    OrderDTO findOne(String orderId);

    /** Query order list. */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /** Cancel order. */
    OrderDTO cancel(OrderDTO orderDTO);

    /** Finish Order. */
    OrderDTO finish(OrderDTO orderDTO);

    /** Pay order. */
    OrderDTO paid(OrderDTO orderDTO);

    /** Query order list. */
    Page<OrderDTO> findList(Pageable pageable);

}
