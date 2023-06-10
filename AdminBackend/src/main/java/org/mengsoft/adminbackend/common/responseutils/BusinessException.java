package org.mengsoft.adminbackend.common.responseutils;

import lombok.Data;
import org.mengsoft.adminbackend.common.responseutils.enums.ResponseCode;

@Data
public class BusinessException extends RuntimeException{

    private Integer statusCode;
    private String message;

    public BusinessException(ResponseCode responseCode){
        this.statusCode = responseCode.getCode();
        this.message = responseCode.getMessage();
    }

}
