package assignment_16_march;

public class Check_number_is_armstrong {

    public static void checkArmstrong(int number) {
        System.out.println("Given Number: " + number);
        System.out.println("Checking if the number is an Armstrong number...");

        int originalNumber = number;
        int sum = 0;
        int numDigits = String.valueOf(number).length(); // Find number of digits

        // Extract each digit and raise it to the power of numDigits
        while (number > 0) {
            int digit = number % 10; // Get last digit
            sum += Math.pow(digit, numDigits); // Add digit^numDigits to sum
            number /= 10; // Remove last digit
        }

        // Check if sum matches the original number
        if (sum == originalNumber) {
            System.out.println("Given Number " + originalNumber + " is an Armstrong number.");
        } else {
            System.out.println("Given Number " + originalNumber + " is NOT an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        checkArmstrong(153);   // Armstrong number
        checkArmstrong(9474);  // Armstrong number
        checkArmstrong(9475);  // Not an Armstrong number
        checkArmstrong(947);   // Not an Armstrong number
        checkArmstrong(0);     // Armstrong number (0^1 = 0)
    }
}
