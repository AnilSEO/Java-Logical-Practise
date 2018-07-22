package sv.javatest.pattern;

import java.util.Random;

public class Test {
	
	private int i;

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public void getValuefor(byte b) {
		System.out.println(b);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte b = 127;
		/*Integer i = 345;
		Byte c = (Byte) i;
		
		System.out.println(c);
				*/
		/*char ch = 'c';
		short a = ch;
		
		System.out.println(ch);*/
		
		Test test = new Test();
		//test.getValuefor(120);
		
        Random random = new Random();
        
        random.nextInt(100);
	}

}
