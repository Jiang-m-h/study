package DynamicLoadingClass.righttest;

import DynamicLoadingClass.OfficeAble;

public class rightoffice {
	
	public static void main(String[] args) {
		
		try {
			//动态加载类，在运行时刻加载
			Class c = Class.forName(args[0]);
			//通过类类型，创建该类对象
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
