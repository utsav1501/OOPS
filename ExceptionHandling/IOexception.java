package ExceptionHandling;
import java.io.*;

public class IOexception {
	

	// Example of FileNotFoundException

	  public static void main(String[] args) {
	    
	    try {
	        // Creating an instance of FileReader class
	        FileReader fileReader = new FileReader("Test.txt");
	    
	        System.out.println(fileReader.read());
	    
	        fileReader.close();
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	  }
	}
