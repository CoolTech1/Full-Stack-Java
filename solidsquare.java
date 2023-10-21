import java.util.Scanner;

public class solidsquare {
    public static void main(String args[]) {
        int i, j, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number :");
        n = scanner.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
