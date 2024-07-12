package object_oriented_programming1;
class student{
	String name;
	int roll_no;
	static private int count;
	public student(String Name,int Roll) {
		name=Name;
		roll_no=Roll;
		count++;
	}
	public static int getsumStudents() {
		return count;
	}
	public void print() {
		System.out.println(name+" : "+roll_no);
	}
}

public class static_datamember_and_member_function {
	public static void main(String[] args) {
		student s1=new student("Utsav",167);
		student s2=new student("Utpal",173);
		s1.print();
		s2.print();
//   	student.count=10;    //we can change it so we make static member function
//		System.out.println(s1.count);
//		System.out.println(s1.count);
//		System.out.println(student.count);
		System.out.println(student.getsumStudents());
		
	}
	
}
