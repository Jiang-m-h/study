package reflect;

public class ClassDemo3 {

	public static void main(String[] args) {
		
		//类的方法信息
		String s = "hello";
		ClassUtil.printClassMethodMessage(s);
		
		Integer n1 = 1;
		ClassUtil.printClassMethodMessage(n1);
		
		//成员变量信息
		ClassUtil.printFieldMessage("hello");
		ClassUtil.printFieldMessage(new Integer(1));
		
		//构造函数信息
		ClassUtil.printConMessage("hello");
		
	}

}
