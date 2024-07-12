package generics;
class pair1Use<T,U>{
	//abstract class pair1Use<T,U>implements printInterface{//Generic bound ke liye abstract bnana pra hai
	public T first;
	public U second;
	
	public pair1Use(T first,U second) {
		this.first=first;
		this.second=second;
	}
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first=first;
	}
	public void setSecond(U second) {
		this.second=second;
	}
	public U getSecond() {
		return second;
	}
}

public class pair1 {

	public static void main(String[] args) {
		pair1Use<Integer,String> P=new pair1Use<Integer,String>(5,"cd");
		pair1Use<Character,String> P1=new pair1Use<Character,String>('a',"cd");
		int a=10;
		int b=12;
		int c=15;
		pair1Use<Integer,Integer> internalpair=new pair1Use<>(a,b);
		pair1Use<pair1Use<Integer,Integer>,Integer> p3=new pair1Use<>(internalpair,c);
		
		System.out.println(p3.getSecond());
		System.out.println(p3.getFirst().getSecond());
		System.out.println(p3.getFirst().getFirst());
	}

}
