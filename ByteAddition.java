package basicPrograms;

public class ByteAddition {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
//		byte b3 = b1+b2;//Compilation Error
//		short b3 = b1+b2;//Compilation error
//		int b3 = b1+b2;
		
		byte b3 =(byte) (b1+b2);//Concept type casting. Type of casting is called "narrowing"
		System.out.println(b3);
	}

}

/*
 * Note: Converting one data type to another data type is called as type casting.
 * Type casting in case primitive data type:
 * 1. Widening
 * 	a. If we store lower data type value in higher data type variable
 * 		Ex: int x = 13; long l = x;
 * 	b. This is implicit(Java will take care such things automatically) in nature
 * 2. Narrowing
 * 	a. If we store higher data type value in lower data type variable
 * 		Ex: int x = 10; byte b1 = x;//In this case we'll be getting compilation error. To resolve this first we've to type cast
 * 										to the desired data type then we can use the variable for further use.
 * 	b. It's explicit in nature i.e. user has to take care
 * 
 *  Type casting in case derived data type:
 *  1. Upcasting
 *  2. Downcasting 
 * 
 * 
*/
