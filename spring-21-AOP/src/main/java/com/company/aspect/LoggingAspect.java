package com.company.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

//    @Pointcut("execution(* com.company.controller.CourseController.*(..))")
//    private void myPointCut() {
//    }
//
//    @Before("myPointCut()")
//    public void log(){
//        logger.info("Info log ........");
//    }


//    @Before("execution(* com.company.controller.CourseController.*(..))()")
//    public void log(){
//        logger.info("Info log ........");
//    }

    @Pointcut("execution(* com.company.repository.CourseRepository.findById(*))")
    private void courseRepoFindById() {
    }

    @Before("courseRepoFindById()")
    public void BeforeCourseRepoFindById(JoinPoint joinPoint) {
        logger.info("Before -> Method : {} ,Arguments {},Target :{}"
                ,joinPoint.getSignature(),joinPoint.getArgs(),joinPoint.getTarget());

    }




}
