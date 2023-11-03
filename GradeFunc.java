import java.util.Scanner;

public class GradeFunc {
    static char grade(double percentage) {
        if (percentage < 50) {
            return 'D';
        } else if (percentage >= 50 && percentage <= 69) {
            return 'C';
        } else if (percentage >= 70 && percentage <= 89) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public static void main(String[] args) {
        double percentage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Percentage : ");
        percentage = sc.nextDouble();
        sc.close();

        System.out.println("Grade : " + grade(percentage));
    }
}