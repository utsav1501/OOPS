package generics;
//isme hum bs integer aur string ko print krwa painge agar hme method ko isme use krna hai uske liye hame GenericBound
//banana prega
public class GenericMethods {
	public static <T> void printArray(T a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer a[]=new Integer[10];
		for(int i=0;i<10;i++) {
			a[i]=i+1;
		}
		printArray(a);
		
		String s[]=new String[10];
		for(int i=0;i<10;i++) {
			s[i]="abc";
		}
		printArray(s);
	}
}
