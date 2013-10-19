package bean;

import org.springframework.stereotype.Service;

/**
 * @author husan
 * @Date 2013-10-18
 * @description
 */
@Service("hello")
public class HelloImpl implements Hello {

	public void hello() {
		// TODO Auto-generated method stub
		System.err.println("hello");
	}

}
