package DynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

	public LogHandler(Object target) {
		super();
		this.target = target;
	}

	private Object target;
	
	/*
	 * ������
	 * proxy  ���������
	 * method  ���������ķ���
	 * args �����Ĳ���
	 * 
	 * ����ֵ��
	 * Object  �����ķ���ֵ
	 * */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("��־��ʼ....");
		method.invoke(target);
		System.out.println("��־����");
		return null;
	}

}
