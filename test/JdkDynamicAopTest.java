import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Hello;
import bean.Service;

/**
 * @author husan
 * @Date 2013-10-18
 * @description
 */
public class JdkDynamicAopTest {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*Hello hello = (Hello)ctx.getBean("hello");
		hello.hello();
		System.out.println(hello.getClass());*/
		Service service = (Service) ctx.getBean("service");
		service.do1();
		System.out.println(service.getClass());
	}

}
