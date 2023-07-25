package com.company.aspect;

import com.company.dto.CourseDTO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

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
//
//    @Pointcut("execution(* com.company.repository.CourseRepository.findById(*))")
//    private void courseRepoFindById() {
//    }
//
//    @Before("courseRepoFindById()")
//    public void BeforeCourseRepoFindById(JoinPoint joinPoint) {
//        logger.info("Before -> Method : {} ,Arguments {},Target :{}"
//                ,joinPoint.getSignature(),joinPoint.getArgs(),joinPoint.getTarget());
//
//    }
//
//    @Pointcut("within(com.company.controller.*)")
//    private void anyControllerOperation() {
//    }
//    @Pointcut("@within(org.springframework.stereotype.Service)")
//    private void anyServiceAnnotatedOperation() {
//    }
//
//    @Before("anyControllerOperation() || anyServiceAnnotatedOperation()")
//    public void beforeControllerOrServiceAdvice(JoinPoint joinPoint) {
//        logger.info("Before -> Method : {} ,Arguments {},Target :{}"
//                ,joinPoint.getSignature(),joinPoint.getArgs(),joinPoint.getTarget());
//
//    }
//
//    @Pointcut("@annotation(org.springframework.web.bind.annotation.DeleteMapping)")
//    private void anyDeleteMappingOperation() {
//    }
//    @Before("anyDeleteMappingOperation()")
//    public void beforeDeleteMappingAdvice(JoinPoint joinPoint) {
//        logger.info("Before -> Method : {} ,Arguments {},Target :{}"
//                ,joinPoint.getSignature(),joinPoint.getArgs(),joinPoint.getTarget());
//
//    }

    //    @Pointcut("@annotation(com.company.annotation.LoggingAnnotation)")
//    private void anyLoggingOperation() {
//    }
//    @Before("anyLoggingOperation()")
//    public void beforeLoggingAdvice(JoinPoint joinPoint) {
//        logger.info("Before -> Method : {} ,Arguments {},Target :{}"
//                ,joinPoint.getSignature(),joinPoint.getArgs(),joinPoint.getTarget());
//
//    }
//    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
//    private void anyGetMappingOperation() {
//    }
//    @AfterReturning(pointcut = "anyGetMappingOperation()",returning = "result")
//    public void afterReturningGetMappingAdvice(JoinPoint joinPoint,Object result) {
//        logger.info("AfterReturning -> Method : {} ,Result :{}"
//                ,joinPoint.getSignature(),result);
//    }


//    @AfterReturning(pointcut = "anyGetMappingOperation()",returning = "results")
//    public void afterReturningGetMappingAdvice(JoinPoint joinPoint, List<CourseDTO> results) {
//        logger.info("AfterReturning -> Method : {} ,Result :{}"
//                ,joinPoint.getSignature(),results.toString());
//    }
    // CourseDTO -> Object --> This is ok
    // List<CourseDTO> -> Object --> This is not ok

//    @AfterThrowing(pointcut = "anyGetMappingOperation()", throwing = "exception")
//    public void afterThrowingGetMappingAdvice(JoinPoint joinPoint, RuntimeException exception) {
//        logger.info("AfterThrowing -> Method : {} ,Exception :{}"
//                , joinPoint.getSignature(), exception.getMessage());
//    }
//
    @Pointcut("@annotation(com.company.annotation.LoggingAnnotation)")
    private void anyLoggingOperation() {
    }
    @Around("anyLoggingOperation()")
    public Object anyLoggingOperationAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Before -> Method : {} ,Parameter : {}"
                , proceedingJoinPoint.getSignature().toShortString(), proceedingJoinPoint.getArgs());
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Exception ex) {
            logger.error("Exception : {}", ex.getMessage());
            throw ex;
        }
        logger.info("After -> Method : {} ,Result : {}"
                , proceedingJoinPoint.getSignature(), result);
        return result;
    }

}
