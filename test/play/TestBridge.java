package play;

import java.lang.reflect.Method;
/*
 * 桥接方法： spring Aop API的桥接方法
 */

abstract class A<T> {
	abstract T get(T t);
}

class B extends A<String> {
	@Override
	String get(String s) {
		return "";
	}
}

public class TestBridge {
	public static void main(String[] args) {
		Class<B> clazz = B.class;
		Method[] methods = clazz.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			System.out.println(m.toGenericString() + " is Bridge Method? " + m.isBridge());
		}
	}
	
	
}
