package inheritance;

class Parent0504202202
{
	int i=10, j=15;
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
	private void pM4()
	{
		
	}
}

class Child0504202202 extends Parent0504202202
{
	//All members with public, protected & default*(based on the package) will be by default present here
}

public class ClassInheritance2 {

	public static void main(String[] args) 
	{
		System.out.println("==========With parent reference===================");
		Parent0504202202 p = new Parent0504202202();
		System.out.println(p.i);//10
		System.out.println(p.j);//15
		p.pM1();//Parent method1
		p.pM2();//Parent method2
		p.pM3();//Parent method3
		
		System.out.println("===========With child reference==================");
		
		Child0504202202 c = new Child0504202202();
		System.out.println(c.i);//10
		System.out.println(c.j);//15
		c.pM1();//Parent method1
		c.pM2();//Parent method2
		c.pM3();//Parent method3
//		c.pM4();//As the private members can't be accessed outside of the declared class
	}

}
