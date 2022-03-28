package basicPrograms;

class Addition25032204
{
	int i, j;//by default i=0 & j=0
	public void add()
	{
		System.out.println(i+j);//15+30=45
	}
	
	public Addition25032204(int x, int y)//x=15, y=30
	{
		i=x;//i=15
		j=y;//j=30
	}
}

public class Main25032204 
{
	public static void main(String[] args) 
	{
		Addition25032204 a = new Addition25032204(15, 30);
		a.add();
	}
}