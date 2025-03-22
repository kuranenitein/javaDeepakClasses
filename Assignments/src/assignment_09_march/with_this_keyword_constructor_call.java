package assignment_09_march;

public class with_this_keyword_constructor_call {
	

	with_this_keyword_constructor_call()
	{	
		this(1,2,3);
     System.out.println("I am default constructor");
	}
	
	with_this_keyword_constructor_call(int a)
	{
		this();
	System.out.println("I am one parameter constructor");
	}
	
	with_this_keyword_constructor_call(int a, int b)
	{
		this(1);
	System.out.println("I am two parameter constructor");

	}
	
	with_this_keyword_constructor_call(int a, int b, int c)
	{
		
	System.out.println("I am three parameter constructor");
		
	}
	
	with_this_keyword_constructor_call(int a, int b, int c, int d)
	{
		this(2,1);
	System.out.println("I am four parameter constructor");
		
	}
	
	
	
	public static void main(String[] args) {
		
		with_this_keyword_constructor_call wtk = new with_this_keyword_constructor_call(1,2,3,4);
		
		
		
	}

}
