import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);

        if (Character.isDigit(x)) {
            System.out.println("IS DIGIT");
        } else {
            System.out.println("ALPHA");
            if (Character.isUpperCase(x)) {
                System.out.println("IS CAPITAL");
            } else {
                System.out.println("IS SMALL");
            }
        }
    }
}
