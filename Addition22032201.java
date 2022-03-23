package basicPrograms;

public class Addition22032201 {
	int i=16;//i is global variable of non static type
	public static void main(String[] args) {
		int j=15;//j is local variable
		Addition22032201 a = new Addition22032201();//Created the object of Addition22032201 class
		System.out.println(a.i+j);//Answer is 31
	}
}