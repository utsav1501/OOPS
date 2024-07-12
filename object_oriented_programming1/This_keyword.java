package object_oriented_programming1;
class thiskey{
	String name;
	int rollNumber;
	public thiskey(String name,int rollNumber) {
//		name=name;
//		rollNumber=rollNumber;
		this.name=name;
		this.rollNumber=rollNumber;
	}
	public void print() {
		System.out.println(name+" "+rollNumber);
	}
}

public class This_keyword {
	public static void main(String[] args) {
		thiskey t=new thiskey("utsav",167);
		t.print();
	}

}
/*when we don't put this keyword inside constructor then it will considered it(name and roll) as local variable*/