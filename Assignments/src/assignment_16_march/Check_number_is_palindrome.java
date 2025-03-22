package assignment_16_march;


public class Check_number_is_palindrome {
	
	
	public void checkNumberIsPalindrome(int a)
	
	{
		
		System.out.println("Given Number is "+ a);
		
		System.out.println("Checking number is Palindrome or not");
		
		int givenNUmber =a;
		int reversedNumber = 0;
		
        while (a > 0) {
            int digit = a % 10; // Get last digit
            reversedNumber = reversedNumber * 10 + digit; // Append to reversedNumber
            a = a / 10; // Remove last digit
        }
        	
		
		
		if(givenNUmber ==reversedNumber)
		{
			System.out.println("Given Number "+ givenNUmber + " is a Palindrome number");

		}else
		{
			System.out.println("Given Number "+ givenNUmber + " is not a Palindrome number");

		}
		
	}	


	public static void main(String[] args) {
		
		Check_number_is_palindrome chp = new Check_number_is_palindrome();
		chp.checkNumberIsPalindrome(222);

		}

}
