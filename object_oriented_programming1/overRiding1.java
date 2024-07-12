package object_oriented_programming1;
class papa{
	public void Bike() {
		System.out.println("Baap ka Bike hai");
	}
}
class Beta extends papa{
	public void Bike() {
		System.out.println("Baap ka Bike hai lekin beta use krega");
	}
}

public class overRiding1 {
	public static void main(String[] args) {

		Beta b=new Beta();
		b.Bike();//overRiding occurs
		papa a=new papa();
		a.Bike();
		
	}

}
