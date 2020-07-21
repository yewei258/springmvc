package com.ye.utils;

import java.io.Serializable;

public class ResultBean implements Serializable {

    private String code;

    private String message;

    private Object data;

    private ResultBean() {

    }

    public ResultBean(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResultBean Ok(Object data) {
        return new ResultBean("00000", "success", data);
    }

    public static ResultBean ERROR(String code, String message) {
        return new ResultBean(code, message, null);
    }

    public static ResultBean ERROR(String code, String message, String data) {
        return new ResultBean(code, message, data);
    }
}
