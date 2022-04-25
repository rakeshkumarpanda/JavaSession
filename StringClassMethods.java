package stringConcepts;

public class StringClassMethods {

	public static void main(String[] args) {
		String s="Efflorescence";
		String s1 = "Java is a very good programming language";
		
		//Finding the length
		System.out.println("String length: "+s.length());
		
		//Finding the character at specific location
		char c = s.charAt(4);
		System.out.println(c);//o
		//String contains a pattern
		System.out.println(s.contains("ore"));//true
		System.out.println(s.contains("sdfh"));//false
		
		//Finding the position of the desired character
		System.out.println(s.indexOf('e'));//6
		System.out.println(s.indexOf('e', 7));//9
		System.out.println(s.indexOf('a'));//-1
		//To make the entire string to upper case
		System.out.println(s.toUpperCase());
		
		//To make the entire string lower case
		System.out.println(s.toLowerCase());
		
		//Finding the sub string
		System.out.println(s.substring(3));//lorescence
		System.out.println(s.substring(3, 10));//loresce
		//splitting
		String[] sSplit = s.split("e");
		for(String x:sSplit)
			System.out.print(x+"\t");
		System.out.println();
		String[] s1Split = s1.split(" ");
		for(String x:s1Split)
			System.out.print(x+"\t");
		System.out.println();
		//Replacing
		String replace = s1.replace("good", "difficult");
		System.out.println(replace);
		//Converting into character array
		char[] charArray = s.toCharArray();
		for(char x:charArray)
			System.out.print(x+"  ");
		
	}

}
