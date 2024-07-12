package object_oriented_programming1;
class bike2{
	String color;
	private int maxSpeed;
	
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
class thar2 extends bike2{
	 int num_gears;
	 boolean isConvertible;
	 public void print() {                             
		 System.out.println("Car color: "+color);
		 System.out.println("Car speed: "+getMaxSpeed());
		 System.out.println("car numGears: "+num_gears);
		 System.out.println("car isConverttible: "+isConvertible); 
	 }
}

public class overRiding {
	public static void main(String[] args) {
		bike2 v=new bike2();
		v.color="Black";
		v.setMaxspeed(10);
		v.print();
		
		thar2 c=new thar2();
		c.num_gears=10;
		c.color="DarkBlack";
		c.setMaxspeed(100);
		c.print();       //OVER_RIDING


	}

}
