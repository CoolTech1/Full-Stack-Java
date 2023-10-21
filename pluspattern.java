import java.util.Scanner;

public class pluspattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n * 2 - 1; i++) {
            if (i != n)
                for (int j = 1; j <= n; j++) {
                    if (j == n)
                        System.out.print("+ ");
                    System.out.print(" ");
                }
            else
                for (int j = 1; j <= n * 2 - 1; j++) {
                    System.out.print("+");
                }
            System.out.println();
            sc.close();
        }
    }
}
