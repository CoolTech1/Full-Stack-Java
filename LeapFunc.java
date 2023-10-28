import java.util.Scanner;

public class LeapFunc {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner a = new Scanner(System.in);
        int yr = a.nextInt();
        leap(yr);
        a.close();
    }

    static void leap(int yr) {
        if (yr % 100 == 0) {
            if (yr % 400 == 0)
                System.out.println("This is century leap year");
        } else {
            if (yr % 4 == 0)
                System.out.println("This is the leap year");
            else
                System.out.println("This is not leap year");
        }
    }
}
