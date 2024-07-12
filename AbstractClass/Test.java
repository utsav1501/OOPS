package AbstractClass;

abstract class ABC{
	 int value;
	 abstract int do_something();
	}
class add extends ABC{
	public add(int n) {
		this.value=n;
	}
	 int do_something(){
	 return value + 42;
	 }
	}
	 
class mul extends ABC{
	 int do_something(){
	 return value * 42;
	 }
	}

public class Test {
	public static void main(String[] args) {
		 add x = new add(10);
		 mul y = new mul();
		 System.out.println(x.do_something());
		 System.out.println(y.do_something());
		 }
	}
