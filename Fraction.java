package oops;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	
	public Fraction(int numerator, int denominator) {
		
		if(denominator == 0) {
			///throw error
			denominator = 1;
		}
		
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	//getting and setting numerator
	public void setNumerator(int num){
		this.numerator = num;
		simplify();
	}
	
	public int getNumerator(){
		return numerator;
	}
	
	//getting and setting denominator
	
	public void setDenominator(int num) {
		if(num == 0) {
			///throw error
			return;
		}
		this.denominator = num;
		simplify();
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	private void simplify(){
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		
		for(int i = 1; i<=smaller; i++) {
			if(numerator % i == 0 && denominator%i ==0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;	
		
	}
	
	public void increment() {
		numerator = numerator + denominator;
		simplify();
	}
	
	
	public void print(){
		System.out.println(numerator + "/" + denominator);
	}
	
	public void add(Fraction f2) {
	//BY DEFAULT FIRST FRACTIONN is f1, f1 is called by f1.add
		this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		simplify();
		
	}
	
	//lets create a function to add two functions just by taking values of two diff fraction,
	//rather than calling one function
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int newNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
		int newDen = f1.denominator*f2.denominator;
		Fraction f3 = new Fraction(newNum, newDen);
		return f3;
	}

}
