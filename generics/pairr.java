package generics;

public class pairr<T,S> {
	private T first;
	private S second;
	
	public pairr(T first,S second ) {
		this.first=first;
		this.second=second;
	}
	public T getFirst() {
		return first;
	}
	public void  setFirst(T first) {
		this.first=first;
	}
	public S getSecond() {
		return second;
	}
	public void setSecond(S second) {
		this.second=second;
	}
	public static void main(String[] args) {
		//int a=10;
		pairr<String,Integer> pInner=new pairr<String,Integer>("ab",10);
		//pairr<pairr<String, Integer>, Integer>p=new pairr<>(pInner,a);
		pairr<pairr<String,Integer>,String>p=new pairr<>(pInner,"hi");
		//p.setFirst(pInner);
//		p.setSecond("abcd");
//		System.out.println(p.getSecond());
		System.out.println(p.getFirst());
		System.out.println(p.getFirst().getFirst());
		System.out.println(p.getFirst().getSecond());
		System.out.println(p.getSecond());
	}
}
