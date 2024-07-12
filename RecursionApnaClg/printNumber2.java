/************************printNumbers(1-5)***********************************/
package RecursionApnaClg;

public class printNumber2 {
	public static void PrintNumbers(int n){
		if(n==5) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
			PrintNumbers(n+1);
//			System.out.println(n);
	}
	public static void main(String[] args) {
		
		int n=1;
		PrintNumbers(n);

	}

}
