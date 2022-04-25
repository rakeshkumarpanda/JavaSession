package stringConcepts;

public class StringInitialization {

	public static void main(String[] args) 
	{
		//Literal Initialization
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "Selenium";
		String s7 = "java";
		
		//Using object
		String s4 = new String("Java");
		String s5 = new String("Java");
		String s6 = new String("Selenium");
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s4);
//		System.out.println(s5);
//		System.out.println(s6);
//		System.out.println(s3);
		
		//Address comparision
//		System.out.println(s1==s2);//true
//		System.out.println(s1==s3);//false
//		System.out.println(s1==s4);//false
//		System.out.println(s1==s5);//false
//		System.out.println(s1==s6);//false
//		System.out.println(s4==s5);//false
//		System.out.println(s3==s6);//false
		
		//Value comparision
//		System.out.println(s1.equals(s2));//true
//		System.out.println(s1.equals(s3));//false
//		System.out.println(s1.equals(s4));//true
//		System.out.println(s1.equals(s5));//true
//		System.out.println(s1.equals(s6));//false
//		System.out.println(s4.equals(s5));//true
//		System.out.println(s3.equals(s6));//true
//		System.out.println(s2.equals(s7));//false
//		System.out.println(s2.equalsIgnoreCase(s7));//true
		
		s1 = "Test";
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//false
		
		String s8 = "Sachin";
		String s9 = "Tendulkar";
		s8 = s8+s9;
		System.out.println(s8);//SachinTendulkar
	
		
	}

}

/*
 * Why String is immutable?
 * 
 * 
 */
