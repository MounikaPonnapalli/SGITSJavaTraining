// Program to find the sum of natural numbers from 1 to 1000
public class Forloop {
  public static void main(String[] args) {
      
    int sum = 0;
    int n = 1000;

    for (int i = n; i >= 1; i--){
      sum += i;     // sum = sum + i
    }
       
    System.out.println("Sum = " + sum);
  }
}