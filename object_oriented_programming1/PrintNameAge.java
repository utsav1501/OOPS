package object_oriented_programming1;
import java.util.* ;


import java.io.*; 
	
//	class Person {
		
		// Complete the class
//		private String name;
//		private int age;
//
//		public void setValue(String name,int age){
//			this.name=name;
//			this.age=age;
//		}
//		public void getValue(){
//			System.out.print("The name of the person is "+name+" and the age is "+age+".");
//		}

//	}


public class PrintNameAge {
	private String name;
	private int age;

	public void setValue(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void getValue(){
		System.out.print("The name of the person is "+name+" and the age is "+age+".");
	}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			int age=sc.nextInt(); 
			//Person p1=new Person();
			PrintNameAge p1=new PrintNameAge();
			p1.setValue(name, age);
			p1.getValue();


			p1.setValue(name, age);

		}
	}
