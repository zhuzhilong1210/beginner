package com.beginner.base;

import com.beginner.common.ResponseData;
import com.beginner.exception.BaseException;
import com.beginner.exception.EnumErrMsg;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {

    protected ResponseData response(Object data) {
        return ResponseData.create(data);
    }

    // 定义exceptionHandler 解决未被controller层吸收的exception
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    protected Object handlerException(HttpServletRequest request, Exception ex) {
        Map<String, String> data = new HashMap<>();
        if (ex instanceof BaseException) {
            BaseException baseException = (BaseException) ex;
            data.put("errCode", baseException.getErrCode());
            data.put("errMsg", baseException.getErrMsg());
        } else {
            data.put("errCode", EnumErrMsg.UNKNOWN.getCode());
            data.put("errMsg", EnumErrMsg.UNKNOWN.getMsg());
        }
        return ResponseData.create("FAIL", data);
    }
}
