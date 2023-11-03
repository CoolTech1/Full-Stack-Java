import java.util.Scanner;

public class InsuranceFunc {
    static void premium(char gender, int age, char city) {
        if ((age >= 25 && age <= 35) && gender == 'M' && city == 'Y') {
            System.out.println("Premium is 6%");
        } else if ((age >= 25 && age <= 40) && gender == 'M' && city == 'N') {
            System.out.println("Premium is 4%");
        } else if ((age >= 25 && age <= 42) && gender == 'F' && city == 'Y') {
            System.out.println("Premium is 3%");
        } else if ((age >= 25 && age <= 45) && gender == 'F' && city == 'N') {
            System.out.println("Premium is 2%");
        } else {
            System.out.println("Not Insured");
        }
    }

    public static void main(String[] args) {
        char cityIsMetro, gender;
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        sc.nextLine();

        System.out.print("Enter city is metro (Y/N)");
        cityIsMetro = sc.next().charAt(0);

        System.out.print("Enter Gender (M/F)");
        gender = sc.next().charAt(0);

        System.out.print("Enter Age : ");
        age = sc.nextInt();

        sc.close();

        premium(gender, age, cityIsMetro);
    }
}