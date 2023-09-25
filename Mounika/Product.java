//Product of 1 to 100 numbers
class Product
{
    public static void main(String[] args) 
    {
        double p=1.0;
        for(int i=1;i<=100;i++)
        {
            p*=i;
        }
        System.out.printf("Product of numbers from 1 to 100 is "+p);
    }
}
