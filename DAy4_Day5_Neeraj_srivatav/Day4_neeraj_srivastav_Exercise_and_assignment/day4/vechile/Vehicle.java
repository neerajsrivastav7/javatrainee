
public abstract class Vehicle {
	String engine;
	String color;
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract void startEngine();
	public abstract void stopEngine();
	public abstract void move();
	
}
