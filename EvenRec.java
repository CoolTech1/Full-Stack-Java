import java.util.Scanner;

public class EvenRec {
    public static void main(String[] args) {
        System.out.println("enter the no.");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        even(n);
        a.close();
    }

    static void even(int n) {
        if (n == 0) {
            return;
        }
        even(n - 1);
        if (n % 2 == 0)
            System.out.println(n);
    }
}
