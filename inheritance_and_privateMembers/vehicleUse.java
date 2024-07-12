package inheritance_and_privateMembers;

public class vehicleUse {
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.color="Black";
		v.setMaxspeed(10);
		v.print();
		
		car c=new car();
		c.numGears=10;
		c.color="Brown";
		c.setMaxspeed(100);
		c.print();
		
	}
}
