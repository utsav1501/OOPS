package object_oriented_programming1;

public class student_demo {
	public String name;
	//private int roll_no;
	final int roll_no;//we have also declare here
	
	
//	public student_demo(String nam) {
//		name=nam;
//	}
	public student_demo(int n) {
		roll_no=n;
	}
	public student_demo(String n,int rn) {
		name=n;
		roll_no=rn;
	}
	
//	public void set_rollno(int n) {
//		if(roll_no<=0) {
//			return;
//		}
//		roll_no=n;//cannot change the value of roll_no once assigned to student_demo
//	}
//	public int getroll_no() {
//		return roll_no;
//	}
	public void print() {
		System.out.println(name+" : "+roll_no);
	}
}
//default:-Access within the package
//public:-access everywhere
//private:-access only within the class