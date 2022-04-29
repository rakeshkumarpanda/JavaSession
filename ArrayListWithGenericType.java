package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithGenericType {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(-127635);
//		l.add(true);//CE: As the list l is specified with int data type. So we can't keep any other data type values
		
		for(int x:l)
			System.out.println(x);

	}

}
