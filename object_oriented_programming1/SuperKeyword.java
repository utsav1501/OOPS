/****************for_instance_variable***********/
package object_oriented_programming1;
class parent{
	int studentsNo=10;
}
class Base extends parent{
	int studentsNo=20;
	public void call() {
		System.out.println("parent's class Student: "+super.studentsNo);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Base b=new Base();
		System.out.println(b.studentsNo);
		b.call();
		

	}

}
