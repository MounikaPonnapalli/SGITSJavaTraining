package Srujith7;
public class FibonacciSeriesWhileLoop 
{
    public static void main(String[] args) 
    {
        int current = 0;
        int previous = 1;
    
        System.out.println("Fibonacci Series between 0 to 50:");
    
        while (current <= 50) 
        {
            System.out.print(current + " ");
            current= current+ previous;
            previous = current - previous;
        }
    }
}