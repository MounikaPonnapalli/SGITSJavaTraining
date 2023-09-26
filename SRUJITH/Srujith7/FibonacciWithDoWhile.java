package Srujith7;
public class FibonacciWithDoWhile 
{
    public static void main(String[] args) 
    {
        int n = 10; // Change this value to the desired number of Fibonacci numbers
        
        int firstTerm = 0;
        int secondTerm = 1;
        
        System.out.println("Fibonacci Series (first " + n + " terms):");
        
        int i = 1;
        do {
            System.out.print(firstTerm + " ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        } 
        while (i <= n);
    }
}