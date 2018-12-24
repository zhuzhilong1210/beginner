package com.beginner.base;

import com.beginner.common.ResponseData;
import com.beginner.exception.BaseException;
import com.beginner.exception.EnumErrMsg;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseController {

    protected ResponseEntity response(Object data) {
        return ResponseEntity.ok(ResponseData.create(data));
    }

    // 定义exceptionHandler 解决未被controller层吸收的exception
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    protected ResponseEntity handlerException(HttpServletRequest request, Exception ex) {
        Map<String, String> data = new HashMap<>();
        if (ex instanceof BaseException) {
            BaseException baseException = (BaseException) ex;
            data.put("errCode", baseException.getErrCode());
            data.put("errMsg", baseException.getErrMsg());
        } else {
            data.put("errCode", EnumErrMsg.UNKNOWN.getCode());
            data.put("errMsg", EnumErrMsg.UNKNOWN.getMsg());
        }
        return ResponseEntity.ok(ResponseData.create("FAIL", data));
    }
}
