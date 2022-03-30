package basicPrograms;

class PrintClass
{
	static int i=10;
	int j = 15;
	
	public static void printI()
	{
		System.out.println(i);
	}
	public void printj()
	{
		System.out.println(j);
	}
}

public class Main30032201
{
	public static void main(String[] args) 
	{
		PrintClass a = new PrintClass();
		System.out.println(a.j);//15
		System.out.println(a.i);//Static member invocation using reference variable - ----- 10
		a.printI();//10
		a.printj();//15
		
		System.out.println(PrintClass.i);//10
		PrintClass.printI();//10
	}
}

/*
Notes:
Non static:
1. static keyword shouldn't be associated with the member
2. non static member generally invoked using an object
3. also called as instance member as we are invoking the members using the instances

Static:
1. static keyword should be associated with the member
2. it gets loaded into the system prior to object creation
3. these are members are also called as class members
4. We can invoke these members directly with the help of class name(recommeded) or using the object
*/