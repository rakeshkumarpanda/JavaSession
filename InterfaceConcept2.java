package inheritance;

interface Interface0804202202
{
	public abstract void m1();
	abstract void m2();
	void m3();
}
interface Interface0804202203
{
	public abstract void m4();
	abstract void m5();
	void m6();
}
class Parent0804202203
{
	public void m7() {
		System.out.println("Parent class m7");
	}
	public void m8() {
		System.out.println("Parent class m8");
	}
}

class Child0804202203 extends Parent0804202203 implements Interface0804202202, Interface0804202203
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
	public void m9()
	{
		System.out.println("From child m9");
	}
	@Override
	public void m4() {
		System.out.println("Overridden m4");
		
	}
	@Override
	public void m5() {
		System.out.println("Overridden m5");
		
	}
	@Override
	public void m6() {
		System.out.println("Overridden m6");
		
	}
	
}

public class InterfaceConcept2 {

	public static void main(String[] args) 
	{

//		Interface0804202201 i = new Interface0804202201();//We can't create any object of any interface
//		i.m1();//Overridden m1
//		i.m2();//Overridden m2
//		i.m3();//Overridden m3
		System.out.println("====== Output from upcasted from Interface0804202202 =========");
		Interface0804202202 i = new Child0804202203();
		i.m1();//Overridden m1
		i.m2();//Overridden m2
		i.m3();//Overridden m3
		
		System.out.println("====== Output from upcasted from Interface0804202203 =========");
		Interface0804202203 i1 = new Child0804202203();
		i1.m4();//Overridden m4
		i1.m5();//Overridden m5
		i1.m6();//Overridden m6
		
		System.out.println("====== Output from upcasted from Parent0804202203 =========");
		Parent0804202203 p = new Child0804202203();
		p.m7();//Overridden m7
		p.m8();//Overridden m8
		
		
		System.out.println("====== Output from direct child class =========");
		Child0804202203 c = new Child0804202203();
		c.m1();//Overridden m1
		c.m2();//Overridden m2
		c.m3();//Overridden m3
		c.m4();//From child m4
		c.m5();//Overridden m5
		c.m6();//Overridden m6
		c.m7();//Overridden m7
		c.m8();//Overridden m8
		c.m9();//From child m9
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
