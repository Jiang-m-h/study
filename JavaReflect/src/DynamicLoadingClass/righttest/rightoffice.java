package DynamicLoadingClass.righttest;

import DynamicLoadingClass.OfficeAble;

public class rightoffice {
	
	public static void main(String[] args) {
		
		try {
			//��̬�����࣬������ʱ�̼���
			Class c = Class.forName(args[0]);
			//ͨ�������ͣ������������
			OfficeAble oa = (OfficeAble) c.newInstance();
			oa.start();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
