package module2;

public class Dog{
	String name;
	
	public static void main(String[] args) {
		
		Dog buddy = new Dog();
		Dog bunny = buddy;
		
		System.out.println(buddy == bunny);
		System.out.println(buddy.equals(bunny));

	}
	
} 
