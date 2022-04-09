package inheritance;

class Parent0804202201
{
	public void pM1()
	{
		System.out.println("Parent1 method1");
	}
	void pM2()
	{
		System.out.println("Parent1 method2");
	}
	protected void pM3()
	{
		System.out.println("Parent1 method3");
	}
}

class Parent0804202202
{
	public void pM4()
	{
		System.out.println("Parent2 method1");
	}
	void pM5()
	{
		System.out.println("Parent2 method2");
	}
	protected void pM6()
	{
		System.out.println("Parent2 method3");
	}
}

//class Child0804202201 extends Parent0804202201, Parent0804202202 ----> Here we will be getting CE as child class is getting inherited from multiple parent
//{
//	public void pM7()
//	{
//		System.out.println("Child method1");
//	}
//	void pM8()
//	{
//		System.out.println("Child method2");
//	}
//	public void cM1()
//	{
//		System.out.println("Child method3");
//	}
//}

public class ClassInheritance7 {

	public static void main(String[] args) 
	{
		
	}

}