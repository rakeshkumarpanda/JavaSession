package basicPrograms;

public class LocalVariableAddition {

	public static void main(String[] args) {
		int x=12, y;// Here x & y are the local variables
//		System.out.println(x+y);//Getting compilation error because y is a local variable and not been initialized before its use
		y=15;
		System.out.println(x+y);//Answer : 27
		//To be continued.....
	}

}
