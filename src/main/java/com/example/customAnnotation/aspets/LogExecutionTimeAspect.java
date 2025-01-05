package com.example.customAnnotation.aspets;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LogExecutionTimeAspect {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(LogExecutionTimeAspect.class);

    @Around("@annotation(com.example.annotations.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object proceed = joinPoint.proceed(); // Execute the method

        long executionTime = System.currentTimeMillis() - startTime;
        logger.info("{} executed in {} ms");

        return proceed;
    }
}
