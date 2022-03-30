package basicPrograms;

class Addition29032205
{
	int i, j, k;
	public void add()
	{
		System.out.println(i+j+k);
	}
	
	public Addition29032205()
	{
		k=14;
	}
	
	public Addition29032205(int i, int j)
	{
		this();
		this.i=i;
		this.j=j;
	}
}

public class Main29032205
{
	public static void main(String[] args) 
	{
		int i=18, j=18;
		Addition29032205 a = new Addition29032205(i, j);
		a.add();//Answer = 50
	}
}