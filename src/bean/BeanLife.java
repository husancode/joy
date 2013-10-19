package bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author husan
 * @Date 2013-10-17
 * @description
 */
public class BeanLife implements InitializingBean,DisposableBean,BeanInterface{
	
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}
	
	public void init(){
		System.out.println("init-method");
	}
	
	public void custordestory(){
		System.out.println("custordestory");
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet");
	}
	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

}
