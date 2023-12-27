package oops;

public class ComplexNumber {
	
	private int realnum;
	private int imaginarynum;
	//private char i;//iota
	
	
	public ComplexNumber(int realnum, int imaginarynum) {
		this.imaginarynum = imaginarynum;
		this.realnum = realnum;
		
	}
	
	public void plus(ComplexNumber c2) {
		
		this.realnum = this.realnum + c2.realnum;
		this.imaginarynum = this.imaginarynum + c2.imaginarynum;
		
	}
	
	public void print() {
		System.out.println(this.realnum + " + i" + this.imaginarynum);
	}
	
	public void Multiply(ComplexNumber c2) {
		int real = this.realnum*c2.realnum - this.imaginarynum*c2.imaginarynum;
		this.imaginarynum = this.realnum*c2.imaginarynum + this.imaginarynum*c2.realnum;
		this.realnum = real;
	}
}
