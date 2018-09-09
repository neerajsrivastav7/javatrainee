
public class Boat extends Vehicle{

	
	public void startEngine() {
		System.out.println("Boat Started");
	}

	public void stopEngine() {		
		System.out.println("Boat stopped");
	}

	public void move() {		
		System.out.println("Boat moved");
	}
	public static Boat getInstance(){
		
		return new Boat();
		
	} 
	
}
