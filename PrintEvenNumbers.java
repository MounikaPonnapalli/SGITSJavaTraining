package javapractice;
import java.util.Scanner;
public class PrintEvenNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		
			
			for (int i=1; i<=n; i++)   
			{  
			  if (i%2==0)   
			 {  
			  System.out.print(i + " ");  
			 }  
			}
			 System.out.println();//for printing nextline
			long product=1;
			for(int i=1;i<=100;i++)
			{
				
				product*=i;
			}
			System.out.println("product of 1 to 100 " +product);
	
	}

}
