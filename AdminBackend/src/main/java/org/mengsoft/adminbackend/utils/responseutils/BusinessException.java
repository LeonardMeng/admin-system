package org.mengsoft.adminbackend.utils.responseutils;

import lombok.Data;
import org.mengsoft.adminbackend.utils.responseutils.enums.ResponseCode;

@Data
public class BusinessException extends RuntimeException{

    private Integer statusCode;
    private String message;

    public BusinessException(ResponseCode responseCode){
        this.statusCode = responseCode.getCode();
        this.message = responseCode.getMessage();
    }

}
