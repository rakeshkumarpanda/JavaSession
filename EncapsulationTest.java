package encapsulation;

public class EncapsulationTest {

	public static void main(String[] args) {
		EncapsulationClass e = new EncapsulationClass();
		e.setName("Ghost Rider");
		e.setAge(1000);
		
		EncapsulationClass e1 = new EncapsulationClass();
		e1.setName("Iron Woman");
		e1.setAge(24);
		
		e.retrieveValues();
		e1.retrieveValues();

	}

}
