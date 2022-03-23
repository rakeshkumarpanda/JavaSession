package basicPrograms;

public class Addition22032202 {
	int i;//i is global variable of non static type and the default value for i is 0.
	public static void main(String[] args) {
		int j=15;//j is local variable
		Addition22032202 a = new Addition22032202();//Created the object of Addition22032201 class
		System.out.println(a.i+j);//Amit - null: null+15=null. Neha & Payal  - 15: 0+15=15. Final answer: 0+15 = 15
	}
}