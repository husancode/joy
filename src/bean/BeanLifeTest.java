package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author husan
 * @Date 2013-10-17
 * @description
 */
public class BeanLifeTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext1.xml");
		BeanInterface beanLife = (BeanInterface)ctx.getBean("bean1");
	
		beanLife.say();
		System.out.println(beanLife.getClass().getName());
		ctx.destroy();
	}

}
