package object_oriented_programming1;

public class DynamicArrayuse {
public static void main(String[] args) {
	DynamicArray d=new DynamicArray();  //constructor
	for(int i=0;i<10;i++) {
		d.add(i+10);
	}
	System.out.println(d.size());
	System.out.println(d.get(3));
	d.set(4,10);
	System.out.println(d.get(4));
	 
	while(!d.isEmpty()) {
		System.out.println(d.removeLast());
	System.out.println("size= "+d.size());
}
	}
}
