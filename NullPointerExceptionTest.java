package exceptionHandling;

public class NullPointerExceptionTest {

	public static void main(String[] args) {
//		String s = "test";
//		int length = s.length();
//		System.out.println(length);
//		
//		String s1 = null;
//		int length1 = s1.length();
//		System.out.println(length1);
		String s2=null;
		try
		{
			int length1 = s2.length();
			System.out.println(length1);
		}
		catch(NullPointerException e)
		{
			System.out.println("s2 should not be null");
		}

	}

}

/*
 * Note:
 * 1. Exceptions - This the problem occured during the program execution
 * 2. Checked Exception - Basically the exception caught by the compiler by doubting on the input given
 * 3. Unchecked Exception - Basically the exception caught during the program execution because of some invalid input
 * 4. All exceptions can be handled using try catch block. All risky statements because of which there might be the chance of exception are 
 * 		enclosed inside the try block and the exception which we are going to get must be handled inside the catch block
 * 5. A single try block can have n number of catch blocks associated with it.
 * 
 * 
 * 
 */
