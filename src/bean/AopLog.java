package bean;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 基于注解的AOP日志示例
 * @author ZYWANG 2011-3-24
 */
@Component
@Aspect
public class AopLog {
	@Pointcut("execution (* bean.*.*(..))")
	public void point1(){}
	
	//方法执行前调用
	@Before("execution (* bean.Hello.*(..))")
	public void before() {
		System.out.println("before");
	}
	
	/*//方法执行后调用
	@After("point1()")
	public void after() {
		System.out.println("after");
	}
	
	//方法执行的前后调用
	@Around("point1()")
	public Object around(ProceedingJoinPoint point) throws Throwable{
		
		
		System.out.println("begin around");
		Object object = point.proceed();
		
		System.out.println("end around");
		return object;
	}
	
	
	
	
	//方法运行出现异常时调用
	@AfterThrowing(pointcut = "execution (* bean.*.*(..))",throwing = "ex")
	public void afterThrowing(Exception ex){
		System.out.println("afterThrowing");
		ex.printStackTrace();
	}*/
}