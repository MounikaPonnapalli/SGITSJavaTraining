//Fibonacci series - {0,1,1,2,3,5,8,13,21}
import java.util.Scanner;

class FibonacciSeries1
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of elements you want:");
        int num=input.nextInt();
        int a=0,b=1;
        System.out.println("Fibonacci Series:");
        for(int i=0;i<num;i++)
        {
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
