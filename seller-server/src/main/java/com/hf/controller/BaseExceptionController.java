package com.hf.controller;

import com.hf.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BaseExceptionController {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handlerException(Exception exception){
        exception.printStackTrace();
        return new Result(false,exception.getMessage());
    }
}
