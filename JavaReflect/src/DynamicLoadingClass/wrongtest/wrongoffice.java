package DynamicLoadingClass.wrongtest;

import DynamicLoadingClass.Word;

public class wrongoffice {

	public static void main(String[] args) 
	{
		//new �����Ķ��� �Ǿ�̬�����࣬�ڱ���ʱ�̾���Ҫ�������п���ʹ�õ�����
		//��Word�ֻ࣬������word����û��Excel�࣬���Ա���
		//�����100�����ܣ�����һ������δʵ�֣��������ܶ��������С�
		//ͨ����̬�����࣬���Խ��������
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
