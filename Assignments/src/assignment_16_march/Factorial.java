package assignment_16_march;

public class Factorial {

    public static long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i; // Multiply fact by i
        }

        return fact;
    }

    public static void main(String[] args) {
        int number = 5;
        long result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
