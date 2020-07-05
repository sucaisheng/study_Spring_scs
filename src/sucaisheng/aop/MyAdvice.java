package sucaisheng.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAdvice {

    @Pointcut("execution(* sucaisheng.proxy.*ServiceImpl.*(..))")
    public void pc(){}

    @Before("MyAdvice.pc()")
    public void before(){
        System.out.println("前置通知");
    }

    @After("MyAdvice.pc()")
    public void afterReturning(){
        System.out.println("必须程序正常执行后置通知");
    }

    public void throwing(){
        System.out.println("程序异常通知");
    }

    public void finalAfter(){
        System.out.println("最终通知");
    }

    public Object around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("前环绕通知");
        Object proceed = pj.proceed();
        System.out.println("后环绕通知");
        return proceed;
    }
}
