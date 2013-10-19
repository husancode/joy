import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Service;
import bean.Service1;

/**
 * @author husan
 * @Date 2013-10-17
 * @description
 */
public class AopTest {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		for(String name:ctx.getBeanDefinitionNames()){
			System.out.println(name);
		}
		Service service = (Service)ctx.getBean("service");
		service.do1();
		service.do2();
		System.out.println(service);
		Service1 service1 = (Service1)ctx.getBean("service1");
		service1.do2();
		AbstractBeanFactory bf = (AbstractBeanFactory)ctx.getBeanFactory();
		for(BeanPostProcessor bp :bf.getBeanPostProcessors() ){
			System.out.println(bp);
		}
	}

}
