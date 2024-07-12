/*In this program we won't use generic bcz here we compare this program with generic program for better understanding*/
package generics;
class pair11{
	private int first;
	private int second;
	
	public pair11(int first,int second) {
		this.first=first;
		this.second=second;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first=first;
	}
	public void setSecond(int second) {
		this.second=second;
	}
	public int getSecond() {
		return second;
	}
}
public class pairUse {

	public static void main(String[] args) {
		pair11 p=new pair11(1,2);
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());

	}

}
