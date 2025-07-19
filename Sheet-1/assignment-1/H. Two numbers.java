import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result = a / b;

        System.out.println("floor " + (int) a + " / " + (int) b + " = " + (int) Math.floor(result));
        System.out.println("ceil " + (int) a + " / " + (int) b + " = " + (int) Math.ceil(result));
        System.out.println("round " + (int) a + " / " + (int) b + " = " + Math.round(result));
    }
}
