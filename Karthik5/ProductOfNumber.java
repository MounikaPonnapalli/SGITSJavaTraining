package Karthik5;
public class ProductOfNumber {
    public static void main(String[] args) {
        long product = 1; // Initialize the product to 1

        for (int i = 1; i <= 100; i++) {
            product *= i; // Multiply the current number with the product
        }

        System.out.println("The product of numbers from 1 to 100 is: " + product);
    }
}
