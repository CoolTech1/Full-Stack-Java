import java.util.Scanner;

public class VowelsOrConsonantsFunc {
    public static boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        String str;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Character : ");
        str = sc.next();
        sc.close();
        c = str.toUpperCase().charAt(0);
        if (isVowel(c)) {
            System.out.println("Character is a Vowel");
        } else {
            System.out.println("Character is consonants");
        }
    }
}
