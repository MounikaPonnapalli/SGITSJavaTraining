public class MultiplicationTable {
    public static void main(String[] args) {
        int start = 23;
        int end = 28;

        System.out.println("Multiplication table from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
