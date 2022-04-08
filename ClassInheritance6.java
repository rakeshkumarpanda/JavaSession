package inheritance;

class Parent0504202206
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

class Child0504202206 extends Parent0504202206
{
	public void pM1()
	{
		System.out.println("Child method1");
	}
	void pM2()
	{
		System.out.println("Child method2");
	}
	public void cM3()
	{
		System.out.println("Child method3");
	}
}

public class ClassInheritance6 {

	public static void main(String[] args) 
	{
		Parent0504202206 p = new Child0504202206();// Upcasting: Storing the child class object in to parent class reference
		p.pM1();
		p.pM2();
		p.pM3();
//		p.cM3();//CE - as this method is not common between parent class and child class
		
//		Child0504202205 c = new Parent0504202205();//CE becuase of downcasting and downcasting is explicit
		Child0504202206 c = (Child0504202206)new Parent0504202206();//Not recommended
		c.cM3();
		c.pM1();
		c.pM2();
		c.pM3();
	}

}

/*
 * Note:
 * Upcasting: 
 * 1. Storing the child class object in to parent class reference
 * 2. in this case the members which are common between the parent and the child should be invoked by the reference.
 * 3. It's implicit in nature
 * 
 * Downcasting:
 * 1. Storing parent class object into child class reference
 * 2. It's explicit in nature
 * 
 * 
 */


