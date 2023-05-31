package ru.blackmirrror.pr14_24.service;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Service
@org.aspectj.lang.annotation.Aspect
public class Logging {
    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Before("execution(* ru.blackmirrror.pr14_24.service.*.*(..)) ")
    public void logBefore(JoinPoint joinPoint) {
        log.info(
                "[" + joinPoint.getSignature().getDeclaringTypeName() + "]" +
                        " Entering method \"" + joinPoint.getSignature().getName() + "\" at " +
                        dateFormat.format(new Date())
        );
    }
}
