package inheritance_and_privateMembers;

public class Vehicle {
	protected String color;
	int maxSpeed;
	
	public void setMaxspeed(int maxSpeed) {
		this.maxSpeed=maxSpeed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void print() {
		System.out.println("Vehicle color: "+color);
		System.out.println("Vehicle speed: "+maxSpeed);
	}

}
