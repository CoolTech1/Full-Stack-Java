import java.util.Scanner;

public class SumOfDigitRec {
    static int sum = 0;

    static void digitSum(int num) {
        if (num == 0) {
            return;
        }
        int ld = num % 10;
        sum = sum + ld;
        digitSum(num / 10);
    }

    public static void main(String[] args) {
        {
            System.out.println("Enter the number");
            Scanner a = new Scanner(System.in);
            int n = a.nextInt();
            a.close();

            digitSum(n);
            System.out.println("The total sum is :" + sum);
        }
    }
}