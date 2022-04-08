package inheritance;

class Parent0504202203
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
}

class Child0504202203 extends Parent0504202203
{
	int l = 16, k=18;
	public void cM1()
	{
		System.out.println("Child method1");
	}
	public void cM2()
	{
		System.out.println("Child method2");
	}
}

public class ClassInheritance3 {

	public static void main(String[] args) 
	{
		System.out.println("==========With parent reference===================");
		Parent0504202203 p = new Parent0504202203();
		System.out.println(p.i);//10
		System.out.println(p.j);//15
		p.pM1();//Parent method1
		p.pM2();//Parent method2
		p.pM3();//Parent method3
//		p.cM1();//As parent can't acquire the child class members
		
		System.out.println("===========With child reference==================");
		
		Child0504202203 c = new Child0504202203();
		System.out.println(c.i);//10
		System.out.println(c.j);//15
		c.pM1();//Parent method1
		c.pM2();//Parent method2
		c.pM3();//Parent method3
		System.out.println(c.k);//18
		System.out.println(c.l);//16
		c.cM1();//Child method1
		c.cM2();//Child method2
	}

}
