package conditionsAndLoops;

/*
 * 1 1 1 1 1
 * 1 1 1 1 1
 * 1 1 1 1 1
 * 1 1 1 1 1
 * 1 1 1 1 1
 * 
 * 
 * 
 */

public class Pattern1 {

	public static void main(String[] args) 
	{
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=5; c++)
			{
				System.out.print("1\t");
			}
			System.out.println();
		}

	}

}
