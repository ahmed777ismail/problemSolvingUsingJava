import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        NumberChecker checker = new NumberChecker(x);
        checker.checkFirstDigitEvenOrOdd();
    }
}
