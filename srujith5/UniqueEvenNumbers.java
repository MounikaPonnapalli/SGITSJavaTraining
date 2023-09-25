package srujith5;
public class UniqueEvenNumbers {
    public static void main(String[] args) {
        int[] elements = {1, 1, 2, 2, 4, 3, 6, 5, 5, 7, 6, 8, 2, 1, 8, 5};
        
        System.out.println("Unique numbers in the list:");
        printUniqueNumbers(elements);
        
        System.out.println("\nEven numbers in the list:");
        printEvenNumbers(elements);
    }
    
    public static void printUniqueNumbers(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < elements.length; j++) {
                if (i != j && elements[i] == elements[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(elements[i] + " ");
            }
        }
    }   
    public static void printEvenNumbers(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 == 0) {
                boolean isUnique = true;
    
                // Check for duplicates after the current element
                for (int j = i + 1; j < elements.length; j++) {
                    if (elements[i] == elements[j] && elements[i] % 2 == 0) {
                        isUnique = false;
                        break;
                    }
                }
    
                if (isUnique) {
                    System.out.print(elements[i] + " ");
                }
            }
        }
    }
    
}