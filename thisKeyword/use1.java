package thisKeyword;


	class Vehicle{
	    private String colour;
	    private int number;
	    void set(int number)
	    {
	        number=number;//if we put this then we get required output ie.1010
	    }
	    int get()
	    {
	        return number;
	    }
	    void set1(String colour) {
	    	colour=colour;//if we put this then we get required output ie.Blue
	    }
	    String go() {
	       return colour;	
	    }
	}

//	class Car extends Vehicle{
		public class use1 {
	    public static void main(String[] args) {
	        Vehicle v = new Vehicle();
	       // v.colour = "white";
	        v.set1("blue");
	        v.set(1010) ;
	        System.out.println(v.go() + " " + v.get());
	    }
	}


