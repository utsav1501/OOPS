/***************PrintFibonacciTILLn********************/
package RecursionApnaClg;
public class Fibbonacci {
	public static void printFibonacci(int a,int b,int n){
		if(n==b) {
			System.out.println(a);
			return;
		}
		System.out.println(a);
		printFibonacci(b,a+b,n);
		//System.out.println(n);
	}

	public static void main(String[] args) {
		printFibonacci(0,1,5);

	}

}
