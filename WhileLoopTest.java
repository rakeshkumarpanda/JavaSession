package conditionsAndLoops;

import java.util.Scanner;

public class WhileLoopTest {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the upper limit: ");
		int upperLimit = scan.nextInt();
		int initNumber = 1;
		while(initNumber>=upperLimit)
		{
//			System.out.print(initNumber+" ");
//			initNumber++;
			System.out.println(upperLimit);
			upperLimit--;
		}
		
	}

}

/*
 * Syntax:
 * 
 * while(condition)
 * {
 * 
 * }
 * 
 * 
 */
