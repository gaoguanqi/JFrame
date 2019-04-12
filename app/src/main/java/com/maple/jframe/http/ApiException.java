package com.maple.jframe.http;

/**
 * author: gaogq
 * time: 2019/4/12 15:41
 * description:
 */
public class ApiException extends RuntimeException{
    private int code;

    public ApiException() {
    }

    public ApiException(String message) {
        super(message);
    }


    public ApiException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
