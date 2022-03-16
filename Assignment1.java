package unaryOperator;

public class Assignment1 {

	public static void main(String[] args) {
		int a = 15;
		int b = ++a + a++;
		System.out.println(a);//Neha - 15, Payal - 31, Amit - 31
		System.out.println(b);// Neha - 32, Payal & Amit - 31
	}

}
