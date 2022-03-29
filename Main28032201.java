package basicPrograms;

class Addition28032201
{
	int i, j;
	public void add()
	{
		System.out.println(i+j);
	}
	
	public Addition28032201(int x, int y)
	{
		i=x;
		j=y;
	}
}

public class Main28032201
{
	public static void main(String[] args) 
	{
		int x=16, y=18;
		Addition28032201 a = new Addition28032201(x, y);
		a.add();
	}
}