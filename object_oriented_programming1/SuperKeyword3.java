package object_oriented_programming1;
class Basic{
	public  Basic() {
		System.out.println("Hi Daddu");
	}
}
class Advance extends Basic{
		public	Advance() {  //constructor
		super(); //Automatic Basic constructor called
		System.out.println("Hi Dada");
	}
}


public class SuperKeyword3 {
	public static void main(String[] args) {
		Advance a=new Advance();

	}

}
