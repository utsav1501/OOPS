package polymorphism;

public class vehicle {
	protected String color;
	private int maxSpeed;
	
	public vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		System.out.println("Vehicle Constructor");
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void print() {
		System.out.println("Vehicle color : " + color);
		System.out.println("Vehicle Speed : " + maxSpeed);
	}

}
