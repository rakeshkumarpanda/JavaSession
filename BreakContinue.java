package conditionsAndLoops;

public class BreakContinue {

	public static void main(String[] args) 
	{
//		for(int i=1; i<=10; i++)
//		{
//			if(i==5)
//				break;
//			else
//				System.out.println(i);
//		}
		
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=1; j<=5; j++)
//			{
//				if(j==4)
//					break;
//				else
//					System.out.println(i+"\t"+j);
//			}
//		}
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j==4)
					continue;
				else
					System.out.println(i+"\t"+j);
			}
		}
		
	}

}

/*
 * Note:
 * 1. To break the current loop we've to use break keyword
 * 2. If we want to skip the current iteration, then we need to use the continue keyword
 * 
 * 
 * 
 */