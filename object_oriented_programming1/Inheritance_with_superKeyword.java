package object_oriented_programming1;
class bus{
	protected String color;
	private int maxSpeed;
	
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
class truck extends bus{
	
}
public class Inheritance_with_superKeyword {

	public static void main(String[] args) {
		

	}

}
