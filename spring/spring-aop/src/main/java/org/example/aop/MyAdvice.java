package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* org.example.dao.BookDao.*d*(..))")
    private void pt() {}

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Long startTime = System.currentTimeMillis();

        pjp.proceed();

        Long endTime = System.currentTimeMillis();
        Long totalTime = endTime - startTime;
        System.out.println(totalTime);
        return null;
    }
}
