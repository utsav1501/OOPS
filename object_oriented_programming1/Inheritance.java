package object_oriented_programming1;
class bike{
	int maxSpeed;
	String color;
	
	public void print() {
		System.out.println("Vehicle color: "+color);
		System.out.println("Vehicle speed: "+maxSpeed);
	}
}
 class thar extends bike{
	 int num_gears;
	 boolean isConvertible;
}

public class Inheritance {

	public static void main(String[] args) {
		bike v=new bike();
		v.print();
		
		thar c=new thar();
		c.num_gears=10;
		c.color="Black";
		c.print();

	}

}
