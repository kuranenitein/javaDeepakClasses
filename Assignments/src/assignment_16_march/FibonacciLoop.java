package assignment_16_march;

public class FibonacciLoop {
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        printFibonacci(12);
    }
}
