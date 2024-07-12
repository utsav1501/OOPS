package RecursionCodingNinjas;

public class objectiveQ1 {
	public static void print(int n){
	    if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.println(n);
	        return;
	    }
//	    print(n--);      Here we are doing post decrement so the value goes to function is same for every call and thus stack overflow occurs
	    print(--n);
	    System.out.print(n+" ");
	}

	public static void main(String[] args) {
	    int num = 4;
	    print(num);
	}

}

