public class FindEvenUniqueElements {
        public static void main(String[] args) {
            int[] arr = {1, 1, 2, 2, 4, 3, 6, 5, 5, 7, 6, 8, 2, 1, 8, 5};
    
            // Create a new array to store unique elements
            int[] uniqueElements = new int[arr.length];
            int uniqueCount = 0;
    
            //  Iterate through the given array and add unique elements to the new array
            for (int i = 0; i < arr.length; i++) {
                boolean isUnique = true;
                for (int j = 1; j < uniqueCount; j++) {
                    if (arr[i] == uniqueElements[j]) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    uniqueElements[uniqueCount] = arr[i];
                    uniqueCount++;
                }
            }
    
            // Iterate through the new array and print even elements
            System.out.println("Even unique elements in the array:");
            for (int i = 0; i < uniqueCount; i++) {
                if (uniqueElements[i] % 2 == 0) {
                    System.out.println(uniqueElements[i]);
                }
            }
        }
    }
    
    


        
    
    

 