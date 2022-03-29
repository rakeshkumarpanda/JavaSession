package basicPrograms;

class Addition28032203
{
	int i, j;
	public void add()
	{
		System.out.println(i+j);
	}
	
	public Addition28032203(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
}

public class Main28032203
{
	public static void main(String[] args) 
	{
		int i=18, j=18;
		Addition28032203 a = new Addition28032203(i, j);
		a.add();//Answer is 36
	}
}
/*
1. "this" is a keyword in java which refers to the current class instance(nothing but an object).
2. With the help of "this" we can invoke the members of the class
*/