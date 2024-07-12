package object_oriented_programming1;
class ve{
	void print_V(){
        System.out.print("Vehicle class ");
    }
}
class car extends ve{
	void print_C(){
        System.out.print("Car class ");
}

}
public class vehicle {
	public static void main(String[] args) {
		car obj1=new car();
		obj1.print_C();
		obj1.print_V();
		
	}
}
