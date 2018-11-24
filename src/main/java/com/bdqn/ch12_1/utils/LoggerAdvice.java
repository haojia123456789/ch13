package com.bdqn.ch12_1.utils;

import org.aopalliance.intercept.Joinpoint;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LoggerAdvice {
    private Logger log = Logger.getLogger(LoggerAdvice.class);
    @Pointcut("execution(* com.bdqn.ch12_1.service..*.*(..))")
    public void ponintCut(){}
    @Before("ponintCut()")
    public void before(JoinPoint jp){
       log.info("调用了"+jp.getTarget()+"类的"+jp.getSignature()
               +"方法入参"+ Arrays.toString(jp.getArgs()));
    }
    @AfterReturning(pointcut="ponintCut()",returning="obj")
    public void afterReturning(JoinPoint jp,Object obj){
        log.info("调用了"+jp.getTarget()+"类的"+jp.getSignature()
                +"方法返回"+ obj);
    }
    @AfterThrowing(pointcut="ponintCut()",throwing="ex")
    public void afterThrow(JoinPoint jp,Exception ex){
        log.info("调用了"+jp.getTarget()+"类的"+jp.getSignature()
                +"方法,发生异常"+ ex);
    }
}
