import java.util.Scanner;

public class ProgramTax {
    public static void main(String[] args) {
        double salary, tax = 0;
        Scanner sc = new Scanner(System.in);
        salary = sc.nextDouble();
        sc.close();

        if (salary < 10_000) {
            tax = 0;
        } else if (salary < 20_000) {
            tax = 0.1 * salary;
        } else if (salary < 30_000) {
            tax = 0.15 * salary;
        } else {
            tax = 0.25 * salary;
        }

        System.out.println("Tax : " + tax);
    }
}