package basicPrograms;

class Addition29032202
{
	int i, j, k;
	public void add()
	{
		System.out.println(i+j+k);
	}
	
	public Addition29032202()
	{
		k=14;
	}
	
	public Addition29032202(int i, int j)//This constructor has not been invoked.
	{
		this.i=i;
		this.j=j;
	}
}

public class Main29032202
{
	public static void main(String[] args) 
	{
		Addition29032202 a = new Addition29032202();
		a.add();//Answer is 14
	}
}

/*
Same method signature, same core functionality but different list of argument(s) - Method overloading (or) compile time polymorphism

Poly---> Many
Morphing -----> Forms

In this program we have done the constructor overloading

Below are the OOPs concepts
1. Polymorphism
2. Inheritance
3. Abstraction
4. Encapsulation

*/