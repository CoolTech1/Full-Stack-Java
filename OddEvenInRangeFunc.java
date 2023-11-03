public class OddEvenInRangeFunc {
    static void printOddEven() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ((i & 1) == 0 ? " is Even" : " is Odd"));
        }
    }

    public static void main(String[] args) {
        printOddEven();
    }
}
