package com.maple.jframe.model.data;

import com.maple.jframe.app.config.AppConfig;

import java.io.Serializable;

/**
 * author: gaogq
 * time: 2019/4/12 11:46
 * description:
 */
public class BaseResponse<T> implements Serializable {

    private int code = -1;
    private String message;
    private T data;

    public boolean isSuccessOK() {
        return code == AppConfig.CODE_REQUEST_SUCCESS ? true : false;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
