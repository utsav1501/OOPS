/********************Print_numbers_from(5-1)**************************/
package RecursionApnaClg;
import java.util.Scanner;
public class printNumber1 {
	public static void print_numbers(int n){
		if(n==0) {
			return;
		}
		System.out.println(n);
	print_numbers(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print_numbers(n);

	}

}
