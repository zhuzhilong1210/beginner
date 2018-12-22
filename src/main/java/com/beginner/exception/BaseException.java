package com.beginner.exception;

public class BaseException extends Exception {
    public EnumErrMsg enumErrMsg;

    public EnumErrMsg getEnumErrMsg() {
        return enumErrMsg;
    }

    public void setEnumErrMsg(EnumErrMsg enumErrMsg) {
        this.enumErrMsg = enumErrMsg;
    }

    public BaseException() {
        super();
    }

    public BaseException(EnumErrMsg enumErrMsg) {
        super();
        this.enumErrMsg = enumErrMsg;
    }

    public BaseException(EnumErrMsg enumErrMsg, String errMsg) {
        super();
        this.enumErrMsg = enumErrMsg;
        this.enumErrMsg.setMsg(errMsg);
    }

    public BaseException(String msg) {
        super();
        this.enumErrMsg.setMsg(msg);
    }

    public String getErrCode() {
        return this.enumErrMsg.getCode();
    }

    public String getErrMsg() {
        return this.enumErrMsg.getMsg();
    }
}
