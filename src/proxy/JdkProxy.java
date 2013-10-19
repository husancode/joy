package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author husan
 * @Date 2013-9-26
 * @description:jdk动态代理，需要实现接口
 *
 */
public class JdkProxy implements InvocationHandler{
	private Object target;
	public JdkProxy(Object target){
		this.target = target;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		//System.out.print(proxy);
		String name = method.getName();
		if(!name.startsWith("do")){
			Object ret = method.invoke(target, args);
			return ret;
		}
		
		Object ret = method.invoke(target, args);
		System.out.print("log:methodName"+method.getName()+";");
		System.out.println("result:"+ret);
		return ret;
	}
	
	public static Object getProxy(Object target){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new JdkProxy(target));
	}
	
	public static void main(String[] args) {
		IObject proxy =  (IObject)getProxy(new RealObject());
		proxy.getName("husan"); 
		
	}
	

}
