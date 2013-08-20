package aop;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author husan
 * @Date 2013-8-13
 * @description
 */
public class AopTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Thinker thinker = (Thinker)context.getBean("volunteer");
		thinker.thinkOfSomething("my thought i lost");
		
	}
	
	public void testThinkAop(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Thinker thinker = (Thinker)context.getBean("volunteer");
		
	}

}


