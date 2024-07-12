package generics;
class genericFxn<T>{
//	private T first;
//	private T second;
	
	public T first;
	public T second;
	
	public genericFxn(T first,T second) {
		this.first=first;
		this.second=second;
	}
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first=first;
	}
	public void setSecond(T second) {
		this.second=second;
	}
	public T getSecond() {
		return second;
	}
}

public class generic {

	public static void main(String[] args) {
		genericFxn<String> g=new genericFxn<String>("ab","cd");
		g.setFirst("def");
		System.out.println(g.getFirst());
		
		genericFxn<Integer>i=new genericFxn<Integer>(1,2);
		genericFxn<Character>c=new genericFxn<Character>('U','K');
		System.out.print(c.first+" ");
		System.out.print(c.second+" ");
		

	}
}

