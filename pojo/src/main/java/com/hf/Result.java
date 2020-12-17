package com.hf;

import java.io.Serializable;

/**
 * Created by Machenike-Pc on 2019/7/12.
 */

public class Result<T> implements Serializable {
    private boolean status;
    private String msg;
    private T data;//返回数据

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Result(boolean status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = (T) data;
    }

    public Result(boolean status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Result() {
    }
}
