package ExceptionHandling;

public class exceptionFind {
	int multiply;
	public void mul(int multiply) throws ZeroDenominatorException{
		if(multiply==0) {
			ZeroDenominatorException e=new ZeroDenominatorException();
			//Exception e=new Exception();
			throw e;	
		}
		this.multiply=multiply;
		System.out.println(multiply);
	}
}
