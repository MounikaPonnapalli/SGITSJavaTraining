package Srujith7;
public class FibonacciSeriesForLoop {
    public static void main(String[] args) {
       // Set the maximum value for the Fibonacci numbers
        int a = 0, b = 1;

        System.out.println("Fibonacci Series between 0 and " + 50 + ":");
       

        for (; a < 50;) {
            System.out.print(" " + a);

            // Update 'a' and 'b' using a mathematical approach
            a = a + b;
            b = a - b;
        }
    }
}