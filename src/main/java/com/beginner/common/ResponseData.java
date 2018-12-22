package com.beginner.common;

public class ResponseData {
    /**
     * 状态，SUCCESS 或 FAIL
      */
    public String status;
    /**
     * 返回数据
     * 如果status=SUCCESS， 返回前端需要的数据
     * 如果status=FAIL， 返回固定格式的错误数据，错误码errCode及错误描述errMsg
     */
    public Object data;

    public ResponseData(){}

    public ResponseData(String status, Object data){
        this.status = status;
        this.data = data;
    }

    public static ResponseData create(Object data){
        return ResponseData.create("SUCCESS", data);
    }

    public static ResponseData create(String status, Object data){
        ResponseData responseData = new ResponseData();
        responseData.setStatus(status);
        responseData.setData(data);
        return responseData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
