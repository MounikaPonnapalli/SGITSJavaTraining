public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1; // Initialize the loop control variable

        System.out.println("Numbers from 1 to 5 using a do-while loop:");

        // Start the do-while loop
        do {
            System.out.println(i); // Print the current value of i
            i++; // Increment i by 1
        } while (i <= 5); // Continue the loop while i is less than or equal to 5
    }
}
