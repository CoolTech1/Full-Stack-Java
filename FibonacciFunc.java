import java.util.Scanner;

public class FibonacciFunc {
    static void fibonacci(int n) {
        int a = 0, b = 1;

        while (n > 0) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            n--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Nubmber : ");
        n = sc.nextInt();
        sc.close();

        fibonacci(n);
    }
}