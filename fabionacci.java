import java.util.Scanner;

public class fabionacci {
    public static void main(String args[]) {
        int a = 0, b = 1, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        while (n > 0) {
            System.out.print(a + " ");
            b += a;
            a = b - a;
            n--;
        }
    }
}
