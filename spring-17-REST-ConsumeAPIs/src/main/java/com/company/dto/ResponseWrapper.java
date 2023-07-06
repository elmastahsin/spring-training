package com.company.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
public class ResponseWrapper {
    private boolean success;
    private String message;
    private Integer code;
    private Object data;

    public ResponseWrapper(String message, Object data){
        this.success=true;
        this.message=message;
        this.data=data;
        this.code= HttpStatus.OK.value();
    }
    public ResponseWrapper(String message){
        this.success=true;
        this.message=message;
        this.code= HttpStatus.OK.value();
    }

}
