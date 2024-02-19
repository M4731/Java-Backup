package aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

    @Before("execution(* services.HelloService.hello(..))")
    public void before(){
        System.out.println("a");

    }

    @After("execution(* services.HelloService.hello(..))")
    public void after(){
        System.out.println("b");

    }

    @AfterReturning("execution(* services.HelloService.hello(..))")
    public void afterReturning(){
        System.out.println("c");

    }

    @AfterThrowing("execution(* services.HelloService.hello(..))")
    public void afterThrowing(){
        System.out.println("d");

    }

    @Around("execution(* services.HelloService.hello2(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Before hello2");
        Object result = null;

        try {
            var resultBetween = proceedingJoinPoint.proceed();
            System.out.println(resultBetween);

            result = proceedingJoinPoint.proceed(new Object[]{"Bill"});
            System.out.println("Inside hello2");
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        System.out.println("After hello2");
        return result;
    }
}
