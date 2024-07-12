package ExceptionHandling;

public class conclusion {

	public static void main(String[] args){
		exceptionFind f=new exceptionFind();
		int i=3;
		try {
		f.mul(i);
			i++;
		}
		catch(ZeroDenominatorException e) {
			System.out.println("Hey! Exception Handled");
		}
		System.out.println(i);
//		catch(ZeroDenominatorException e) {
//			System.out.println("Hey! Don't enter zero as Denominator"+i);
//		}
		
	}

}
