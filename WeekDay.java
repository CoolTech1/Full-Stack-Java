import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        String day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Week Day : ");
        day = sc.next();
        sc.close();

        switch (day.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thrusday":
            case "friday":
                System.out.println("This is Weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("This is Weekend Day");
                break;

            default:
                System.out.println("Invalid Week Day");
                break;
        }
    }
}
