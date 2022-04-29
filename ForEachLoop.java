package arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		String[] str = {"Apple", "Orange", "Grape", "Banana", "Mango"};
		
		//Print all using for loop
		for(int i=0; i<str.length; i++)
			System.out.println(str[i]);
		System.out.println("=======================");
		//Print all using for each loop
		for(String s:str)
			System.out.println(s);
	}

}
