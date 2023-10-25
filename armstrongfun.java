import java.util.Scanner;

public class armstrongfun{
    static int numlenght(int x) {
        int lennum = x;
        int c = 0;
        while (lennum != 0) {
            lennum /= 10;
            c++;
        }
        return c;
    }

    static int findpower(int b, int e) {
        int z = 1;
        for (int i = 1; i <= e; i++) {
            z *= b;
        }
        return z;
    }

    static int isarmstrong(int num1) {
        int copy = num1;
        int numlenght1 = numlenght(copy);
        int sum = 0;
        while (num1 != 0) {
            int lastdigit = num1 % 10;
            sum += findpower(lastdigit, numlenght1);
            num1 /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int number = sc.nextInt();
        // calling the fuction to check number is armstrong or not
        int armstrongvalue = isarmstrong(number);
        if (number == armstrongvalue) {
            System.out.println("Given NUmber is Armstrong");
        } else {
            System.out.println("Given is niot a armstrong");
        }
        sc.close();
    }
}