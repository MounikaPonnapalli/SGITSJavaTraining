import java.util.Scanner;
public class FibonacciSeries{
public static  void main(String[] args) {
    int term,a=0,b=1,c;
    System.out.print("Enter the term");
    Scanner scanner=new Scanner(System.in);
    term=scanner.nextInt();
    System.out.println("FibonacciSeries:");
    for(int i=1;i<=term;i++){
        System.out.print(a + " ");
        c=a+b;
        a=b;
        b=c;
    } 
}
}