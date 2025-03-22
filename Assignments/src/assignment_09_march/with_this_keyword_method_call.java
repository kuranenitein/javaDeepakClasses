package assignment_09_march;

public class with_this_keyword_method_call {
	
	public void m1()
	{	
		this.m4(4,5, 7);
     System.out.println("I am default method");
	}
	
	public void m2(int a)
	{
		this.m3(4, 5);
	System.out.println("I am one parameter method");
	}
	
	public void m3(int a, int b)
	{
		this.m1();
	System.out.println("I am two parameter method");

	}
	
	public void m4(int a, int b, int c)
	{
		
	System.out.println("I am three parameter method");
		
	}
	
	public void m5(int a, int b, int c, int d)
	{
		this.m2(2);
	System.out.println("I am four parameter method");
		
	}
	
	public static void main(String[] args) {
		
		with_this_keyword_method_call wtk = new with_this_keyword_method_call();
		wtk.m5(1, 2, 3, 4);
		
	}



}
