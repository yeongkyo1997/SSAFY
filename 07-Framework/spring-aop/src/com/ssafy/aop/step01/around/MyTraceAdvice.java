package com.ssafy.aop.step01.around;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyTraceAdvice {
    public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
        String signature = joinPoint.getSignature().toShortString();
        System.out.println("MyTraceAdvice: " + signature);
        long start = System.currentTimeMillis();

        try {
            Object result = joinPoint.proceed();
            return result;
        } finally {
            long finish = System.currentTimeMillis();
            System.out.println("MyTraceAdvice : " + signature + " 실행 시간 - " + (finish - start) + "ms");
        }
    }
}
