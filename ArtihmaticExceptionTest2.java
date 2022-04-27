package exceptionHandling;

public class ArtihmaticExceptionTest2 {

	public static void main(String[] args) throws Exception {
		int a = 14, b=0;
		if(b==0)
			throw new Exception("Exception due to denominator value zero");//Checked Exception if we will remove only throws exception from line# 5
		try {
			
			int res = a/b;
			System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("denominator can't zero");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
