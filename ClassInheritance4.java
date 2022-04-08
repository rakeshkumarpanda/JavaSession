package inheritance;

class Parent0504202204
{
	public void pM1()
	{
		System.out.println("Parent method1");
	}
	void pM2()
	{
		System.out.println("Parent method2");
	}
	protected void pM3()
	{
		System.out.println("Parent method3");
	}
}

class Child0504202204 extends Parent0504202204
{
	public void pM1()
	{
		System.out.println("Child method1");
	}
	void pM2()
	{
		System.out.println("Child method2");
	}
}

public class ClassInheritance4 {

	public static void main(String[] args) 
	{
		System.out.println("==========With parent reference===================");
		Parent0504202204 p = new Parent0504202204();
		p.pM1();//Parent method1
		p.pM2();//Parent method2
		p.pM3();//Parent method3
		
		System.out.println("===========With child reference==================");
		
		Child0504202204 c = new Child0504202204();
		c.pM1();//Child method1
		c.pM2();//Child method2
		c.pM3();//Parent method3
	}

}
/*
 * Note: As per pM1() and pM2()
 * 1. Same method signature
 * 2. Same list of arguments
 * 3. Different implementation
 * This concept is called as method overriding or run time polymorphism
 * 
 */

