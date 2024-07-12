package polymorphism;

public class car extends vehicle{
	int numGears;
	boolean isConvertible;
	
	public car(int numGears, int maxSpeed) {
		super(maxSpeed);
		this.numGears = numGears;
		System.out.println("Car Constructor");
	}
	
	public boolean isConvertible() {
		return isConvertible;
	}
	
	public void print() {
		super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
	}
}
