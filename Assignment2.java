package unaryOperator;

public class Assignment2 {

	public static void main(String[] args) {
		int a = 20;
		int b = ++a  +  a++  +  a++  +  ++a  -  ++a  +  --a  -  a--  +  --a;
		System.out.println(a);//Neha - 20, Amit - , Payal - 22
		System.out.println(b);//Neha - 84, Amit - , Payal - 85
	}

}
