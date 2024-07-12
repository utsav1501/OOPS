interface A{
    public void method();
}
class One{
    public void method(){
        System.out.println("Class One method");
    }
}
class Two extends One implements A{
    public void method(){
        System.out.println("Class Two method");
    }
}
public class practise2 {
	  public static void main(String[] args){
	        A a = new Two();
	        a.method();     
	    }

}
