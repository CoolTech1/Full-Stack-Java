import java.util.Scanner;

public class calc {

    public static void main(String[] args) {

        System.out.println("There is Calculator for you");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println(" 1- ADDITION \n 2- SUBTRACTION \n 3- MULTIPLICATION \n 4- DIVIDE");
        int choice = a.nextInt();

        System.out.println("Enter two numbers");
        int m = a.nextInt();
        int n = a.nextInt();
        switch (choice) {
            case 1:
                int result = m + n;
                System.out.println("the result is " + result);
                break;

            case 2:
                result = m - n;
                System.out.println("the result is " + result);
                break;

            case 3:
                result = m * n;
                System.out.println("the result is " + result);
                break;

            case 4:
                result = m / n;
                System.out.println("the result is " + result);
                break;

            default:
                System.out.println("sorry,you have invalid number");
        }
    }
}