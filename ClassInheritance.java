package inheritance;

class Parent0504202201
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
		System.out.println("Parent method4");
	}
}

class Child0504202201
{
	int k=16, l=18;
	public void cM1()
	{
		System.out.println("Child method1");
	}
	public void cM2()
	{
		System.out.println("Child method2");
	}
}

public class ClassInheritance {

	public static void main(String[] args) {
		Parent0504202201 p = new Parent0504202201();
		System.out.println(p.i);//10
		System.out.println(p.j);//15
		p.pM1();//Parent method1
		p.pM2();//Parent method2
		p.pM3();//Parent method3
		
		System.out.println("=============================");
		
		Child0504202201 c = new Child0504202201();
		c.cM2();
		System.out.println(c.l);
		c.cM1();
		System.out.println(c.k);
	}

}
