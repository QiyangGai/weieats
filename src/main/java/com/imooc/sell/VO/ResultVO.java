package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * The Outermost Object Returned from HTTP
 */

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> {
    /** error code. */
    private Integer code;
    /** message. */
    private String msg;
    /** contents. */
    private T data;



}
