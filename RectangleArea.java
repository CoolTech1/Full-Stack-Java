import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        System.out.println("enter the length of rectangle");
        Scanner a = new Scanner(System.in);
        int l = a.nextInt();
        System.out.println("enter the breath of rectangle");
        int b = a.nextInt();
        float parameter = para(l, b);
        float area = ar(l, b);
        System.out.println("the parameter of the rectangle is:" + parameter);
        System.out.println("the area of rectangle is:" + area);
        a.close();
    }

    static int para(int l, int b) {
        int p = 2 * (l + b);
        return p;
    }

    static int ar(int l, int b) {
        int A = l * b;
        return A;
    }
}
