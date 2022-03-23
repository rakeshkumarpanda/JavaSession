package basicPrograms;

public class Addition22032205 
{
	public static void main(String[] args) 
	{
		int i=20, j=16;
		Addition22032205 a = new Addition22032205();
		a.add(i, j);
	}
	public void add(int i, int j)
	//the i and j in main method are not same with the i and j in add method as both are local to their respective methods
	{
		System.out.println(i+j);
	}
	
}