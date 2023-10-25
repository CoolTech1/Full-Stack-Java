import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("enter the first variable");
        Scanner aa = new Scanner(System.in);
        int a = aa.nextInt();
        System.out.println("enter the second variable");
        int b = aa.nextInt();
        swap(a, b);
        aa.close();
    }

    static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swap");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
