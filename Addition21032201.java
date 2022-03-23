package basicPrograms;

class Addition21032201 {
	int i=16;//i is global variable of non static type
	public static void main(String[] args) {
		int j=15;//j is local variable
//		System.out.println(i+j);//Answer is CE
	}
}
/*
1. All methods are having 2 parts
 a. Method signature
 b. method body
2. Static and non-static concept is applicable for all the members of the class i.e. either variable or method or both
3. Here main method is static in nature as static keyword is associated with main method signature
4. If we write static by prefixing to a member then the member is treated as static member
5. If we don’t write static keyword for a member then the member is by default treated as non-static member
6. We can't use non-static members inside a static block. If we want to use the non-static members inside the static block, then
we need to follow any of one from the below
	a. Make the non-static member as static
						or
	b. Create an object of the class which contains the non-static member and access the non-static member by taking the 
	reference of the object

*/