package srujith5;
public class ProductOfNumbers {
    public static void main(String[] args) {
       double product = 1L; // Initialize the product as 1, and use long to avoid overflow
        
        for (int i = 1; i <= 100; i++) {
            product *= i; // Multiply the current number by the product
        }
        
        System.out.println("The product of numbers from 1 to 100 is: " + product);
    }
}

