package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author husan
 * @Date 2013-9-26
 * @description List代理
 */
public class ListProxy {
	
	public static List newListProxy(final List list){
		return (List)Proxy.newProxyInstance(ListProxy.class.getClassLoader(), new Class[]{List.class}, new InvocationHandler() {
			
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// TODO Auto-generated method stub
				if("add".equals(method.getName())){
					throw new UnsupportedOperationException();
				}else{
					return method.invoke(list, args);
				}
			}
		});
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("husan");
		List<String> listProxy = ListProxy.newListProxy(list);
		try {
			listProxy.add("kaka");//被代理的add方法抛出异常，成功进行了访问控制
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(listProxy.size());
	}

}
