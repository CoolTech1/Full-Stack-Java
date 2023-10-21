import java.util.Scanner;

public class ProgramDiscount {
    public static void main(String[] args) {
        double amount, discount = 0;
        Scanner sc = new Scanner(System.in);
        amount = sc.nextDouble();
        sc.close();

        if (amount < 1_000) {
            discount = 0;
        } else if (amount < 5_000) {
            discount = amount * 0.05;
        } else if (amount < 10_000) {
            discount = amount * 0.1;
        } else if (amount < 20_000) {
            discount = amount * 0.15;
        } else {
            discount = amount * 0.25;
        }

        System.out.println("You got " + discount + " discount on your " + amount + " purchase");
    }
}