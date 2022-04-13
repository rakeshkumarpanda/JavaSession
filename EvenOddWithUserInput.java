package conditionsAndLoops;

import java.util.Scanner;

public class EvenOddWithUserInput {

	public static void main(String... args) 
	{
		Scanner scan = new Scanner(System.in);//It's used when we want the input value from the user from the console
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		if(n%2==0)
			System.out.println(n+" is even");
		else
			System.out.println(n+" is odd");
		
	}

}
