import java.util.Scanner;

public class digic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println("the numbers of digits are :" + count);
        sc.close();
    }
}
