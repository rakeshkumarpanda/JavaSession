package arrays;

public class ArrayOperation {

	public static void main(String[] args) {
		int[] a = new int[10];
		
		//Finding the size of an array
		int length = a.length;
		System.out.println("The size of the array is: "+length);
		
		//Inserting the value
		for(int i=0; i<length; i++)
		{
			a[i]=i;
			System.out.println(a[i]);
		}
		
		//Printing the array values
//		for(int i=0; i<length; i++)
//			System.out.println(a[i]);

	}

}

/*
 * Arrays

1. It’s a collect of similar data type values
2. All arrays are fixed in size. After the declaration neither we can increase nor decrease the value of the size
3. Arrays are always index based
4. Always index starts from 0 to n-1 where n is the size of the array
5. Array always follows the insertion order
 * 
 * 
 * 
 */
