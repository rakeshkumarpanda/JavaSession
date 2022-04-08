package inheritance;

abstract class Mobile
{
	public void makeCall()
	{
		System.out.println("Calling feature");
	}
	
	public void sendSMS()
	{
		System.out.println("SMS feature");
	}
	
	public abstract boolean isSmart();
}

class Nokia1600 extends Mobile
{
	@Override
	public boolean isSmart() 
	{
		return true;
	}

	public void battery()
	{
		System.out.println("Nokia 1600 battery");
	}
	
}

public class AbstractClassConcept {

	public static void main(String[] args) 
	{
//		Mobile m = new Mobile();//It's not possible to create an object of an abstract class

		Nokia1600 n = new Nokia1600();
		n.makeCall();//Calling feature
		n.sendSMS();//SMS feature
		System.out.println(n.isSmart());//true
		n.battery();//Nokia 1600 battery

		Mobile m1 = new Nokia1600();//Upcasting
		m1.makeCall();//Calling feature
		m1.sendSMS();//SMS feature
		System.out.println(m1.isSmart());//true
//		m1.battery();//CE - as this method is not to both mobile and nokia1600
	}

}
