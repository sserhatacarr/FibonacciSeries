import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("How many elements do you want in a Fibonacci series: ");
        n = inp.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            // Calculate the next Fibonacci number
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
