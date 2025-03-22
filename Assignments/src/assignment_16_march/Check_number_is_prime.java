package assignment_16_march;

public class Check_number_is_prime {
	
	
	public void checkNumberIsPrime(int a)
	
	{
		
		System.out.println("Given Number is "+ a);
		
		System.out.println("Checking number is prime or not");
		
	    // Handle edge cases
        if (a <= 1) {
            System.out.println("Given Number " + a + " is NOT a prime number.");
            return;
        }
        
        
        
		
		boolean flag = true;
		for(int i = 2; i<=Math.sqrt(a); i++)
		{
			if(a%i==0)
			{
				flag=false;
				break;
			}
		}
		
		
		
		if(flag)
		{
			System.out.println("Given Number "+ a + " is a prime number");

		}else
		{
			System.out.println("Given Number "+ a + " is not a prime number");

		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Check_number_is_prime ch = new Check_number_is_prime();
		ch.checkNumberIsPrime(29);

	}

}
