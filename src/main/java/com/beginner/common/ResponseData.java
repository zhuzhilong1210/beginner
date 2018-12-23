package com.beginner.common;

import org.springframework.http.ResponseEntity;

public class ResponseData<T> {
    /**
     * 状态，SUCCESS 或 FAIL
      */
    public String status;
    /**
     * 返回数据
     * 如果status=SUCCESS， 返回前端需要的数据
     * 如果status=FAIL， 返回固定格式的错误数据，错误码errCode及错误描述errMsg
     */
    public T data;

    public ResponseData(){}

    public ResponseData(String status, T data){
        this.status = status;
        this.data = data;
    }

    public static <T> ResponseData<T> create(String status, T data){
        ResponseData<T> responseData = new ResponseData<>(status, data);
        return responseData;
    }

    public static <T> ResponseData<T> create(T data){
        ResponseData<T> responseData = new ResponseData<>("SUCCESS", data);
        return responseData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
