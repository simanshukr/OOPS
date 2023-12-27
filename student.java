package oops;

public class student {

	String Name;
	private int RollNum;
	String add;
	double CGPA;
	final double conversionFactor = 0.95;
	static int numStudents;
	
	
	
//	lets create own contructor
	
	public student(String n, int num) {
		this.Name = n;
		this.RollNum = num;
		numStudents++;
		
	}
//	if you dont want roll number as mandatory then form a new constructor with same class name
	
	public student(String n) {
		Name = n;
		
		
	}
	
	public void print() {
		System.out.println(Name + " " + RollNum);
	}
	
	
	public int getRollNumber() {
		return this.RollNum;
	}	
	
	public void setRollNumber(int RollNum) {
		
		if(RollNum<=0) {
			return;
		}
		System.out.println("this " + this);
		this.RollNum = RollNum;
		
	}
}

