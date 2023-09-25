import java.util.Scanner;
public class WhileLoop {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number to generate its multiplication table: ");
            int number = scanner.nextInt();

            System.out.println("Multiplication table for " + number + ":");

            int multiplier = 1;
            while (multiplier <= 10) {
                int result = number * multiplier;
                System.out.println(number + " x " + multiplier + " = " + result);
                multiplier++;
            }

            scanner.close();
        }
    }


