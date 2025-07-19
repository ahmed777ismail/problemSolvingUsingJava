import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);

        if (Character.isLowerCase(x)) {
            System.out.println(Character.toUpperCase(x));
        } else {
            System.out.println(Character.toLowerCase(x));
        }
    }
}
