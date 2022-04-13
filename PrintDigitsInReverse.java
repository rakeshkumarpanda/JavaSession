package conditionsAndLoops;

public class PrintDigitsInReverse {

	public static void main(String[] args) {
		int n = 1234;
		while(n>0)
		{
			System.out.print(n%10+"\t");
			n/=10;
		}
		
	}

}
