package object_oriented_programming1;
class baccha{
    String name;
    int rollNo;

    // Constructor 1
    baccha(int num){
            rollNo = num;
            name = "abc";
    }   

    // Constructor 2
    baccha(int num, String str){
            rollNo = num;
            name = str;
    }

    public void print(){
            System.out.print(name +" " + rollNo+" ");
    }
}

public class student_use {
	public static void main(String[] args) {
        baccha s1 = new baccha(101);
        s1.print();
        baccha s2 = new baccha(150, "xyz");
        s2.print();
}
}
