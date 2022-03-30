package basicPrograms;

class Addition29032203
{
	int i, j, k;
	public void add()
	{
		System.out.println(i+j+k);
	}
	
	public Addition29032203()
	{
		k=14;
	}
	
	public Addition29032203(int i, int j)//This constructor has not been invoked.
	{
		this.i=i;
		this.j=j;
	}
}

public class Main29032203
{
	public static void main(String[] args) 
	{
		int i=18, j=18;
		Addition29032203 a = new Addition29032203();
		a.add();//Answer = 14
		Addition29032203 a1 = new Addition29032203(i, j);
		a1.add();//Answer = 36
	}
}