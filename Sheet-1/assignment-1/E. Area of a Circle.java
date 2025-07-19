import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi = 3.141592653;
        double area = pi * r * r;

        System.out.printf("%.9f\n", area);
    }
}
