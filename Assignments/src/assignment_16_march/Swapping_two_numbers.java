package assignment_16_march;

public class Swapping_two_numbers {
	
	
	
	public void swapping_of_two_number_using_third_variable(int a , int b) {
		
		System.out.println("Executing method swapping of two number using third variable");

		
		int c=b;
		b=a;
		a=c;
		
		System.out.println("Value of variable a after swapping is "+a);
		
		System.out.println("Value of variable b after swapping is "+b);
		
		System.out.println("*****************************************************");


	}
	
	public void swapping_of_two_number_without_using_third_variable(int a , int b) {
		
		System.out.println("Executing method swapping of two number without using third variable");

		
        a=a+b;
        b=a-b;
        a=a-b;
		
		System.out.println("Value of variable a after swapping is "+a);
		
		System.out.println("Value of variable b after swapping is "+b);
		
		System.out.println("*****************************************************");


	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swapping_two_numbers sw = new Swapping_two_numbers();
		
		//values of variables before swapping 
		int a = 12;
		int b = 15;
		
		System.out.println("Value of variable a before swapping is "+a);
		
		System.out.println("Value of variable b before swapping is "+b);
		
		//values of variables after swapping 
		sw.swapping_of_two_number_using_third_variable(12 , 15 );
		
		//values of variables after swapping 
		sw.swapping_of_two_number_without_using_third_variable(12 , 15 );		
		
		
		

	}

}
