import java.util.Scanner;

public class Leapyr {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        sc.close();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println("Year is Leaper");
                else
                    System.out.println("Year is not leaper");
            }
        } else

            System.out.println("Year is not leaper");
    }
}
