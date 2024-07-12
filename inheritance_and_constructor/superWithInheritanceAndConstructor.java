package inheritance_and_constructor;
class vehicle{
	private String color;
	private int maxSpeed;
	
//	public vehicle() {  // default constructor
//		
//		System.out.println("vehicle's Constructor");
//	}
	
	public vehicle(int maxSpeed) {  // parametrised constructor
		this.maxSpeed=maxSpeed;
		System.out.println("vehicle's Constructor");
		System.out.println("vehicle's speed: "+maxSpeed);
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxspeed(int maxSpeed) {
		this.maxSpeed=maxSpeed;
	}
	public void print() {
		System.out.println("Vehicle color: "+color);
		System.out.println("Vehicle speed: "+maxSpeed);
	}
}
class car extends vehicle{
	int num_gears;
	boolean isConvertible;
	public car(int num_gears,int maxspeed) {
		super(maxspeed);
		this.num_gears=num_gears;
		System.out.println("Car's Constructor");
		System.out.println("Car's gears: "+num_gears);
	}	
}
public class superWithInheritanceAndConstructor {

	public static void main(String[] args) {
		car c=new car(5,10);
	}

}
