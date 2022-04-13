package conditionsAndLoops;

import java.util.Scanner;

class Test
{
	public void evenOddTestSwitchCase(int n)
	{
		int rem = n%10;
		switch(rem)
		{
			case 0:System.out.println("Even");break;
			case 2:System.out.println("Even");break;
			case 4:System.out.println("Even");break;
			case 6:System.out.println("Even");break;
			case 8:System.out.println("Even");break;
			default:System.out.println("Odd");
		}
	}
}

public class EvenOddSwitchCase {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		Test t = new Test();
		t.evenOddTestSwitchCase(n);
	}
}
/*
Assignment: Find the weekdays and weekends from the week
*/