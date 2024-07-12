/**************for_method()************/
package object_oriented_programming1;
class p{
	public void Harry() {
		System.out.println("Hey! you are in parent class");
	}
}
class B extends p{
	public void Harry() {
		System.out.println("Hey! you are in Base class");
	}
	public void display() {
		super.Harry();
		Harry();
	}
}

public class superKeyword2 {

	public static void main(String[] args) {
	   B b=new B();
	   b.Harry();
	   b.display();
		

	}

}
