package oops;

public class FractionUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(4, 24);
		f1.print();
		
//		f1.increment();
//		f1.print();
		
		Fraction f2 = new Fraction(3, 4);
		
//		f1.add(f2);
		f2.print();
		
		Fraction f3 = Fraction.add(f1, f2);
		f3.print();
	}

}
