package ternaryOperator;

public class EvenOdd {

	public static void main(String[] args) {
		int x = 18;
		//Using if-else
		if(x%2==0)
			System.out.println(x+" is even");
		else
			System.out.println(x+" is odd");
		
		//Ternary operator
		String result = (x%2==0)?"even":"odd";
		System.out.println(x+" is "+result);
	}

}
