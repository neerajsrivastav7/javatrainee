
public class VehicleDemo {

	public static void main(String[] args) {
		Car c=(Car) VehicleFactory.getType("caR");
		System.out.println("name of Class="+c.getClass());
		Boat b=(Boat) VehicleFactory.getType("BOAT");
		System.out.println("name of Class="+b.getClass());
		//System.out.println("name of car="+b.getEngine());
		c.startEngine();
		b.startEngine();
		c.move();
		b.move();
		c.startEngine();
		b.stopEngine();
	}

}
