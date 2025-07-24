import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.next();

        Operation op = new Operation(expr);
        System.out.println(op.calculate());
    }
}