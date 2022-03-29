package basicPrograms;

class Addition28032202
{
	int i, j;
	public void add()
	{
		System.out.println(i+j);
	}
	
	public Addition28032202(int i, int j)
	{
		i=i;
		j=j;
	}
}

public class Main28032202
{
	public static void main(String[] args) 
	{
		int i=18, j=18;
		Addition28032202 a = new Addition28032202(i, j);
		a.add();//Answer is 0
	}
}

/*
Reason:
The main method is having local i & j value with 18 each as its value. The same value will be passed to the parameterized constructor
local variables i & j. As our intention is to initialize the local i & j value to global i & j value. In this case instead of initializing the global i & j,
we are initializing the local variable value to itself again. This problem arises as the global and local variable names are same. That's why the global 
variable value couldn't be initialized with our desired values. Because of which the global variable value still holding 0 as its value. So the final
output is 0+0=0 as add method uses the global i & j.
*/