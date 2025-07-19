import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        long lastDigitN = n % 10;
        long lastDigitM = m % 10;

        System.out.println(lastDigitN + lastDigitM);
    }
}
