package object_oriented_programming1;
//import java.util.Scanner;

public class studentUse {
	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
		
//		student s1=new student();
//		student s2=new student();
//		s1.name="utsav";
		//s1.set_rollno(23);
//		s1.set_rollno(-23);
		
//		System.out.println(s1.name);
//		System.out.println(s1.getroll_no());
		
		
		//constructor
		student_demo s=new student_demo(167);
		student_demo s1=new student_demo("utsav",167);
		student_demo s2=new student_demo("Saurav",420);

		//one object can call only one constructor
		//System.out.println(s1.getroll_no());
		s.print();
		s2.print();
	}
	

}
/*final keyword ko sirf 2 bar initialise kar sakte hai
 * i)jab wo declare ho rha ho,or
 * ii)within a constructor*/
