package Pujitha_5;

import java.util.Arrays;

public class UniqueEven {
     public static void main(String[] args) {
	        int[] arr = {1, 1, 2, 2, 4, 3, 6, 5, 5, 7, 6, 8, 2, 1, 8, 5};
	        
	        
	        int[] uniqueArr = new int[arr.length];
	        int uniqueCount = 0; 
	        
	        
	        for (int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;
	            
	            
	            for (int j = 1; j < uniqueCount; j++) {
	                if (arr[i] == uniqueArr[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            
	            
	            if (!isDuplicate) {
	                uniqueArr[uniqueCount] = arr[i];
	                uniqueCount++;
	            }
	        }
	        int[] resultArr = Arrays.copyOf(uniqueArr, uniqueCount);
	        
	        
	        System.out.println("Array without duplicates and Printing a Even Numbers:");
	        for (int num : resultArr) {
	        	if(num%2==0) {
	            System.out.print(num + " ");}
	        }
	     
	    }
}
