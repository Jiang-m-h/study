package DynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Test {

	/**
	 * JDK动态代理测试类
	 */
	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();
		/**
		 * loader  类加载器
		 * interfaces  实现接口
		 * h InvocationHandler
		 */
		Moveable m = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(),
												cls.getInterfaces(), h);
		InvocationHandler h2=new LogHandler(m);
		Class<?> clh=m.getClass();
		Moveable m2=(Moveable)Proxy.newProxyInstance(clh.getClassLoader(), 
		clh.getInterfaces(), h2);
		m2.move();
		
//		Car car = new Car();
//		Class carClass = car.getClass();
//		InvocationHandler timeHandler = new TimeHandler(car);
//		Moveable proxy = (Moveable) Proxy.newProxyInstance(carClass.getClassLoader(), 
//		carClass.getInterfaces(),timeHandler);
//		
//		InvocationHandler logHandler = new LogHandler(proxy);
//		Moveable proxy2 =  (Moveable) Proxy.newProxyInstance(proxy.getClass().getClassLoader(),
//		proxy.getClass().getInterfaces(), logHandler);
//		proxy2.move();
		
		
	}

}
