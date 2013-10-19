package bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.MindReader;


public class BeanLifeTest {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext1.xml");
		MindReader reader = (MindReader)ctx.getBean("magician");
		reader.interceptThoughts("ssss");
	}

}
