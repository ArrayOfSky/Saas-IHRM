package com.arrayOfSky.commom.handler;

import com.arrayOfSky.commom.entity.Result;
import com.arrayOfSky.commom.entity.ResultCode;
import com.arrayOfSky.commom.exception.CommomException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result error(HttpServletRequest request, HttpServletResponse response,Exception e){

        if(e.getClass()== CommomException.class){
            CommomException ce = (CommomException) e;
            Result result = new Result(ce.getResultCode());
            return result;
        }


        Result result = new Result(ResultCode.SERVER_ERROR);
        return result;
    }

}
