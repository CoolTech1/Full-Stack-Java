import java.util.Scanner;

public class Salary2 {
    static double HRA(double basicSalary) {
        return .3 * basicSalary;
    }

    static double DA(double basicSalary) {
        return .2 * basicSalary;
    }

    static double TA(double basicSalary) {
        return .1 * basicSalary;
    }

    static double netSalary(double basicSalary) {
        return basicSalary - 1400;
    }

    public static void main(String[] args) {
        double basicSalary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary : ");
        basicSalary = sc.nextDouble();
        sc.close();

        System.out.println("HRA : " + HRA(basicSalary));
        System.out.println("DA : " + DA(basicSalary));
        System.out.println("TA : " + TA(basicSalary));
        System.out.println("Net Salary : " + netSalary(basicSalary));
    }
}