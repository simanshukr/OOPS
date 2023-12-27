package employequestionoops;

public class test {
	
//	int a;
//	int b;
	 static int a = 10; 
	 int b =20; 
	    public static void fun1(){ 
//	    	  a = 20;                             //Line 1
//	          b = 10;                             //Line 2
//	          fun2();                             //Line 3
//	          System.out.print(this.b);           //Line 4
	    } 
	    
	    void fun2() 
	    {     
	        System.out.println("from m2"); 
	    }
	    
	    
	    
	    
	    
	    
	    
    public test() 
    {   
        this(10, 20);   
        System.out.print("constructor one "); 
    } 
   public test(int a, int b) 
    { 
        this.a = a; 
        this.b = b; 
        System.out.print("constructor two "); 
    } 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public void set(int a, int b) {
//		b=a;
//		this.b = b;
//	}
//	
//	public void display() {
//		System.out.println("a=" + a + " b=" + b);
//		
//	}

}
