package basicPrograms;

class Addition25032203
{
	int i, j;//Global variable the default value is 0
	public void add()
	{
		System.out.println(i+j);
	}
	
	public Addition25032203() //This is user defined default constructor
	{
		i=14;
		j=15;
	}
}

public class Main25032203 
{
	public static void main(String[] args) 
	{
		Addition25032203 a = new Addition25032203();
		a.add();
	}
}