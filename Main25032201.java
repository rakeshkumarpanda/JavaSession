package basicPrograms;

class Addition25032201
{
	int i=20, j=20;
	public void add()
	{
		System.out.println(i+j);
	}
	
//	public Addition25032201()  ---- Assume this constructor added by java by default. That's why there no implementation. We can't see this
//	{
//		
//	}
}

public class Main25032201 
{
	public static void main(String[] args) 
	{
		Addition25032201 a = new Addition25032201();
		a.add();
	}
}

/*
Notes:
1. Constructors are similar to methods.
2. Basically the constructor name must be same as the class name
3. Constructors are mainly used for initialization purpose
4. There are 2 types of constructors
	a. Default or no argument constructor
	b. Parameterized constructor
	
Default Constructor:
1. Constructor not having any argument(s)
2. Not mandatory to have inside the class
3. If class doesn't have any constructor, then java by default adds the default constructor with no implementation which we can't see
4. If the class contains any constructor, then java doesn't add the default constructor to the class
5. If the class contains the default constructor already then java will consider the default constructor already present inside the class

Parameterized Constructor:
1. Constructor with having argument(s)
2. Mandatory to have inside the class if user invokes the constructor during the object creation
*/