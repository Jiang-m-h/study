package reflect;

public class ClassDemo3 {

	public static void main(String[] args) {
		
		//��ķ�����Ϣ
		String s = "hello";
		ClassUtil.printClassMethodMessage(s);
		
		Integer n1 = 1;
		ClassUtil.printClassMethodMessage(n1);
		
		//��Ա������Ϣ
		ClassUtil.printFieldMessage("hello");
		ClassUtil.printFieldMessage(new Integer(1));
		
		//���캯����Ϣ
		ClassUtil.printConMessage("hello");
		
	}

}
