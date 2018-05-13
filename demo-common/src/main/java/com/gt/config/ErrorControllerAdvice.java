package com.gt.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;

/**
 * Created by Administrator on 2018/5/13.
 */
@ControllerAdvice
public class ErrorControllerAdvice {
    @ExceptionHandler
    public void handlerError(Exception e, HandlerMethod handlerMethod){
        System.out.println("统一处理异常");
        System.out.println(e.getMessage());
        System.out.println(handlerMethod.getBean().getClass());
        System.out.println(handlerMethod.getMethod().getName());


    }
}