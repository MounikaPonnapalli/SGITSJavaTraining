public class SignSeries {
        public static void main(String[] args) {
            int n = 10; // Number of terms in the series

            System.out.println("Sign Series:"); // Print a header for the series
                    // Loop from 1 to n (inclusive)
            for (int i = 1; i <= n; i++) {
                 // Determine the sign of the current term using the modulo operator (%)
                int term = (i % 2 == 0) ? -i : i; // Alternate sign
                // Print the current term
                System.out.print(term);

                // Add a comma and space unless it's the last term
                if (i < n) {
                    System.out.print(", ");
                }
            }
        }
    }


