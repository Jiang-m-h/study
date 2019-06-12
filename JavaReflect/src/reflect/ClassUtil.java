package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {

	/*
	 * ��ӡ�����Ϣ��������ĳ�Ա��������Ա������ֻ��ȡ��Ա������
	 * @param obj �ö������������Ϣ
	 */
	public static void printClassMethodMessage(Object obj) {
		//��ȡ�����Ϣ ����Ҫ��ȡ���������
		Class c = obj.getClass();//���ݵ����ĸ�����Ķ��� c���Ǹ������������
		//��ȡ�������
		System.out.println("��������ǣ�"+c.getName());
		
		/*
		 * Method�࣬��������
		 * һ����Ա��������һ��Method����
		 * getMethods()������ȡ��������
		 * getDeclaredMethods()��ȡ�������и����Լ������ķ������̳����ľ�û���ˡ�
		 */
		
		Method[] ms= c.getMethods();//c.getDeclaredMethods();
		for (int i = 0; i < ms.length; i++) {
			//�õ������ķ���ֵ���͵�������
			Class returnType = ms[i].getReturnType();
			System.out.println("����ֵ����"+returnType.getName()+" ");
			//�õ�����������
			System.out.print(ms[i].getName()+"(");
			//��ȡ��������--->�õ����ǲ����б�����͵�������
			Class[] paramType = ms[i].getParameterTypes();
			for (Class class1 : paramType) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
			
			printFieldMessage(c);
			
		}
		
	}

	/*
	 * ��ȡ��Ա������Ϣ
	 */
	public static void printFieldMessage(Object obj) {
		/*
		 * ��Ա����Ҳ�Ƕ���
		 * java.lang.reflect.Field
		 * Field���װ�˹��ڳ�Ա�����Ĳ���
		 * getFields()������ȡ�������е�public�ĳ�Ա��������Ϣa
		 * getDeclaredFields()��ȡ���Ǹ����Լ������ĳ�Ա������Ϣ
		 */
		
		Class c = obj.getClass();//���ݵ����ĸ�����Ķ��� c���Ǹ������������
		
		//Field[] fs = c.getFields();
		Field[] fs = c.getDeclaredFields();
		
		for (Field field : fs) {
			//�õ���Ա���������͵�������
			Class fieldType = field.getType();
			String typeName = fieldType.getName();
			//�õ���Ա����������
			String fieldName = field.getName();
			System.out.println(typeName+" "+fieldName);
			
		}
	}
	
	/*
	 * ��ӡ����Ĺ��캯������Ϣ
	 */
	public static void printConMessage(Object obj) {
		
		Class c = obj.getClass();
		/*
		 * ���캯��Ҳ�Ƕ���
		 * java.lang.Constructor�з�װ�˹��캯������Ϣ
		 * getConstructors��ȡ���е�public�Ĺ��캯��
		 * getDeclaredConstructors�õ����еĹ��캯��
		 */
		//Constructor[] cs = c.getConstructors();
		Constructor[] cs = c.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			System.out.print(constructor.getName()+"(");
			//��ȡ���캯���Ĳ����б�-->�õ����ǲ����б��������
			Class[] paramTypes = constructor.getParameterTypes();
			for (Class class1 : paramTypes) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
			
		}	
		
	}
	
	
}
