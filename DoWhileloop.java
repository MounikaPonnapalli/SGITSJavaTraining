package javapractice;

public class DoWhileloop {

	public static void main(String[] args) {
		int number=10,sum=0;
	do {
		 if (number > 0) {
             sum += number;
             System.out.println(sum);
             break;
         } else if (number < 0) {
             System.out.println("Stopping input. Sum of positive numbers: " + sum);
         }
     } while (number >= 0);

     
 }
}






