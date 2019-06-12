package DynamicLoadingClass.wrongtest;

import DynamicLoadingClass.Word;

public class wrongoffice {

	public static void main(String[] args) 
	{
		//new 创建的对象 是静态加载类，在编译时刻就需要加载所有可能使用到的类
		//有Word类，只想运行word，但没有Excel类，所以报错
		//如果有100个功能，但有一个功能未实现，其他功能都不能运行。
		//通过动态加载类，可以解决该问题
		if("Word".equals(args[0]))
		{
			Word w = new Word();
			w.start();
		}
//		if("Excel".equals(args[0]))
//		{
//			Excel e = new Excel();
//			e.start();
//		}
	}
	
}
