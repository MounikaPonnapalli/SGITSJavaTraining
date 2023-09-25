//Fibonacci - Series - between 0 to 50. - try to use 2 variables instead of 3.
class FibonacciSeries1
{    public static void main(String[] args) 
    {
        int a=0,b=1;
        System.out.println("Fibonacci Series between 0 and 50:");
        System.out.print(a+" "+b);  
        while(a+b<=50) 
        {
            System.out.print(" "+(a+b));
            b=a+b;
            a=b-a;
        }
    }
    
}