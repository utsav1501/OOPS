package object_oriented_programming1;

public class Fraction_use {
	public static void main(String[] args) {
		Fraction f1=new Fraction(20,30);
		f1.print();
		//2/3
		f1.setNumerator(12);//12/3=4
		
		int d=f1.getDenominator();
		System.out.println(d);//1
		f1.print();//4
		
		f1.setNumerator(10);//10/3
		f1.setDenominator(30);//10/30=1/3
		
		f1.print();//1/3
		Fraction f2=new Fraction(3,4);
		f1.add(f2);//iska matlab f1 me f2 ko add krdo i.e 
		f1.print();
		
		f2.print();
		
		Fraction f3=new Fraction(4,5);
		f3.multiply(f2);//f3 me f2 ko multiply krdo means f3=f3*f2
		f3.print();//3/5
		
		f2.print();
		
		Fraction f4=Fraction.add(f1,f3);//iska matlab f4=f1+f3
		f1.print();//still same=13/12
		f3.print();//still same =3/5
		f4.print();//101/60
		
	}

}
