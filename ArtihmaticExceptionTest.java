package exceptionHandling;

public class ArtihmaticExceptionTest {

	public static void main(String[] args) {
		int a = 14, b=0;
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
			System.out.println("Exception due to exception class");
		}
//		finally
//		{
//			
//		}
		

	}

}
