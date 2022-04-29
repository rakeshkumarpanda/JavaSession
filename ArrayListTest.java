package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		//Decalring the the list and initializing the list reference. List is an interface so can't create the object
		List a = new ArrayList();
		//Adding the elements to the list
		a.add("Apple");
		a.add(10);
		a.add(null);
		a.add(true);
		a.add(19.32);
		a.add('e');
		a.add("Apple");
		a.add(3, "Orange");

		//Printing all the values using for loop
//		for(int i=0; i<a.size(); i++)
//			System.out.println(a.get(i));
//		System.out.println("==========================");
		//Printing all the values using for each loop
//		for(Object x:a)
//			System.out.println(x);
		//Iterating using the Iterator interface
		Iterator itr = a.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		a.remove(3);
		for(Object x:a)
			System.out.println(x);
		
		
	}

}

/*
 * Note:
 * 1. List is an interface
 * 2. It works based on the indices which means it preserves the insertion order
 * 3. It can allow the duplicate and null values
 * 
 * 
 */
