package basicPrograms;

class Addition29032204
{
	int i, j, k;
	public void add()
	{
		System.out.println(i+j+k);
	}
	
	public Addition29032204()
	{
		this(18, 18);
		k=14;
	}
	
	public Addition29032204(int i, int j)//This constructor has not been invoked.
	{
		this.i=i;
		this.j=j;
	}
}

public class Main29032204
{
	public static void main(String[] args) 
	{
		Addition29032204 a = new Addition29032204();
		a.add();//Answer = 14
	}
}
/*
1. this() is useful to invoke the current class another constructor
2. The constructor invocation must be based on the list of argument(s) type
3. this() must be written in the very first line inside the constructor
*/