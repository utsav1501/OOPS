package generics;
/*With the help of Generic bound You can Bound what kind of T is Accepted Here*/


public class GenericBound  {
	//public static <T extends pair1> void printArray(T a[]) {
		/*Here if we extend pair1 then only pair1 printFxn and Pair1 inherited fxn will execute*/
	
	
public static <T extends printInterface> void printArray(T a[]) {//Generic bound ke liye syntax extends hota h not implement
/*yha pe hmne ek contract sign krwaya hai ki jo bhi printInterface ko implement krega whi ayega aur kyo ki 
jo bhi implement krega uske andar to print function hoga hi(Ek bar printInterface classcheck kare)*/
		
		for(int i=0;i<a.length;i++) {
			a[i].Print();
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer a[]=new Integer[10];
		for(int i=0;i<10;i++) {
			a[i]=i+1;
		}
		
		String s[]=new String[10];
		for(int i=0;i<10;i++) {
			s[i]="abc";
		}
	//printArray(a);//-- 
	//printArray(s);//--Hum in dono ko print nhi krwa painge kyo ki ye integer aur String array hai
		
		GenericBoundUse g[]=new GenericBoundUse[10];
		for(int i=0;i<10;i++) {
			g[i]=new GenericBoundUse();
		}
		printArray(g);
	}
}
