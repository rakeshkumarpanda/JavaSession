package inheritance;

interface Interface0804202201
{
	public abstract void m1();
	abstract void m2();
	void m3();
}
class Child0804202202 implements Interface0804202201
{
	@Override
	public void m1() {
		System.out.println("Overridden m1");
	}
	@Override
	public void m2() {
		System.out.println("Overridden m2");
	}
	@Override
	public void m3() {
		System.out.println("Overridden m3");
	}
	public void m4()
	{
		System.out.println("From child m4");
	}
	
}

public class InterfaceConcept {

	public static void main(String[] args) 
	{

//		Interface0804202201 i = new Interface0804202201();//We can't create any object of any interface
//		i.m1();//Overridden m1
//		i.m2();//Overridden m2
//		i.m3();//Overridden m3
		System.out.println("====== Output from upcasted =========");
		Interface0804202201 i = new Child0804202202();
		i.m1();//Overridden m1
		i.m2();//Overridden m2
		i.m3();//Overridden m3
		
		System.out.println("====== Output from direct child class =========");
		Child0804202202 c = new Child0804202202();
		c.m1();//Overridden m1
		c.m2();//Overridden m2
		c.m3();//Overridden m3
		c.m4();//From child m4
	}

}

/*
 * Note:
 * 1. In interface by default all the methods are public and abstract
 * 2. In interface by default all variables are static and final
 * 
 * 
 * 
 */
