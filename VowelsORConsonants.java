import java.util.Scanner;

public class VowelsORConsonants {
    public static void main(String[] args) {
        String str;
        char c;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        sc.close();
        c = str.toUpperCase().charAt(0);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("Character is a Vowel");
        } else {
            System.out.println("Character is not a Vowel");
        }
    }
}
