package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;


/**
 * @author husan
 * @Date 2013-10-17
 * @description
 */
@org.springframework.stereotype.Service
@Scope("prototype")
public class Service {
	@Autowired
	private Service1 service1;
	public void do1(){
		System.out.println("do something 1");
	}
	
	public void do2(){
		service1.do2();
	}

}
