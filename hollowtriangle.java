import java.util.Scanner;

public class hollowtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n)
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            else {
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
            sc.close();
        }
    }
}
