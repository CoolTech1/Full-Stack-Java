import java.util.Scanner;

public class NatureOfNumberFunc {
    static String nature(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Neagative";
        } else {
            return "Zero";
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        num = sc.nextInt();
        sc.close();

        System.out.println("Given Number is : " + nature(num));
    }
}