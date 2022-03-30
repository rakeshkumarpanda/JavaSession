package basicPrograms;

class AreaCalculation
{
	public void getArea(int l, int b)
	{
		System.out.println("Area of the rectangle: "+(l*b));
	}
	
	public void getArea(int r)
	{
		System.out.println("Area of the circle is: "+(3.142*r*r));
	}
}

public class Main29032206
{
	public static void main(String[] args) 
	{
		AreaCalculation a = new AreaCalculation();//Object creation happens during runtime
		a.getArea(10);//314.2
		a.getArea(5, 10);//50
	}
}

/*
Note: 
1. As my main method is not returning any value that's why the return type for the main method is void
2. Generally static means they are getting loaded before an object creation
3. main method getting loaded into the system before the object creation as it's highly required method to start our program execution. That's why main method is
static in nature.
4. All non-staics are otherwise called reference members and they can invoke only through the object
5. Static members are also called as class members & these can be invoked both with the help of object as well as the class name directly.
Recommended is invocation of the static members always with the help of the class name.
*/