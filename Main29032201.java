package basicPrograms;

class Addition29032201
{
	int i, j, k;
	public void add()
	{
		System.out.println(i+j+k);
	}
	
	public Addition29032201()//This constructor is not going to be executed as this has not been invoked during the object creation
	{
		k=14;
	}
	
	public Addition29032201(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
}

public class Main29032201
{
	public static void main(String[] args) 
	{
		int i=18, j=18;
		Addition29032201 a = new Addition29032201(i, j);
		a.add();//Answer is 36
	}
}