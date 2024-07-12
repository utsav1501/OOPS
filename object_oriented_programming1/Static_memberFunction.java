package object_oriented_programming1;
class alpha{
	static int a=10;
	//static int b=4;
	static int b;
	public static void print() {
		b=a*4;
	}
}

public class Static_memberFunction {
public static void main(String[] args) {
	alpha a=new alpha();
	//a.print();
	a.print();
	System.out.println(a.a+a.b);
}
	
}
