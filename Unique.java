package javapractice;
import java.util.Arrays;
public class Unique {
	    public static void main(String[] args) {
	        int[] arr = {1, 1, 2, 2, 4, 3, 6, 5, 5, 7, 6, 8, 2, 1, 8, 5};
	        
	        // Initialize a new array to store unique elements
	        int[] uniqueArr = new int[arr.length];
	        int uniqueCount = 0; // Counter for unique elements
	        
	        // Iterate through the original array
	        for (int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;
	            
	            // Check if the current element is a duplicate
	            for (int j = 0; j < uniqueCount; j++) {
	                if (arr[i] == uniqueArr[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            
	            // If not a duplicate, add it to the unique array
	            if (!isDuplicate) {
	                uniqueArr[uniqueCount] = arr[i];
	                uniqueCount++;
	            }
	        }
	        int[] resultArr = Arrays.copyOf(uniqueArr, uniqueCount);
	        
	        // Print the array without duplicates
	        System.out.println("Array without duplicates:");
	        for (int num : resultArr) {
	        	if(num%2==0) {
	            System.out.print(num + " ");}
	        }
	     
	    }
  }
	
