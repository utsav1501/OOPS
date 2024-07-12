package ExceptionHandling;

public class objectiveQ2 {
    public static void main(String[] args){
    	try{
    		int a=10/0;
    		}
    		catch(ArithmeticException e){
    		System.out.println("Arithmetic Exception");
    		}
//    		catch(IOException e){
//    		System.out.println("input output Exception");
//    		}

    }
   /*********************************Q2*****************************/
//    public static void main(String args[]){  
//    	   try{  
//    	      //code that may raise exception  
//    	      int result=800/0;  
//    	   }
//    	   catch(ArithmeticException e)
//    	   {
//    	       System.out.println(e);
//    	   }  
//    	   //rest code of the program   
//    	   System.out.println("Program execution continues....");  
//    	  }  
//    	} 
    /* :-output:
     java.lang.ArithmeticException: / by zero
    Program execution continues....
     */
}
