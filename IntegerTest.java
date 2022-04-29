package wrapperClasses;

public class IntegerTest {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		Integer a1 = 15;//Compiler does Integer.valueOf(15) operation internally ---> Auto Boxing
		System.out.println(a1);
		
		Integer a2 = Integer.valueOf(16);
		System.out.println(a2);
		
		Integer a4 = a;//Auto boxing ----> Integer.valueOf(a)
		
		
		Integer a3 = 20;
		int a5 = a3;
		System.out.println(a3+"\t"+a5);
		
		Integer a6 = new Integer(25);
		int a7 = a6;// Internally it works like a6.intValue() ------> Unboxing
		int a8 = a6.intValue();
		System.out.println(a6+"\t"+a7+"\t"+a8);
	}

}
