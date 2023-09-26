package Karthik5;
public class UniqueEvenNumbers {
    public static void main(String[] args) {
        int[] elements = {1, 1, 2, 2, 4, 3, 6, 5, 5, 7, 6, 8, 2, 1, 8, 5};
        boolean[] seen = new boolean[elements.length];

        System.out.println("Unique and Even Numbers:");

        for (int i = 0; i < elements.length; i++) {
            int current = elements[i];

            // Skip numbers that have been seen before
            if (seen[i]) {
                continue;
            }

            if (isEven(current)) {
                System.out.print(current + " ");

                // Mark all occurrences of the current number as seen
                for (int j = i; j < elements.length; j++) {
                    if (elements[j] == current) {
                        seen[j] = true;
                    }
                }
            }
        }
    }

    // Function to check if a number is even
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

