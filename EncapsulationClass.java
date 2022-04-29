package encapsulation;

public class EncapsulationClass 
{
	private String name;
	private int age;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void retrieveValues()
	{
		System.out.println(getName()+"\t"+getAge());
	}

}
