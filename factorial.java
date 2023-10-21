import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        long n, fact = 1, temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextLong();
        temp = n;
        sc.close();
        while (temp > 0) {
            fact *= temp;
            temp--;
        }
        System.out.println("factorial of " + n + " is : " + fact);
    }
}
