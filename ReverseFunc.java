import java.util.Scanner;

public class ReverseFunc {
    static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Nubmber : ");
        n = sc.nextInt();
        sc.close();

        System.out.println("reverse of " + n + " is " + reverse(n));
    }
}
