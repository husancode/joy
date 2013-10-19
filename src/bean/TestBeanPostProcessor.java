package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import proxy.JdkProxy;

/**
 * @author husan
 * @Date 2013-10-17
 * @description:aop的原理，应用jdk动态代理为bean产生一个代理，对method方法进行匹配，执行切面
 */
public class TestBeanPostProcessor implements BeanPostProcessor{
	
	private JdkProxy proxy;
	
	
	
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization");
		
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization");
		return proxy.getProxy(bean);
		
	}

}
