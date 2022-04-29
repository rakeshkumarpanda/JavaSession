package arrays;

public class SearchElement {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};//whether 3 or 8 present in the array or not
		int n1=8;
		boolean flag = false;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==n1)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println(n1+" is present in the array");
		else
			System.out.println(n1+" is not present in the array");

	}
}