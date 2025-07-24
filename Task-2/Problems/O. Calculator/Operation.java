
class Operation {
    private int a, b;
    private char op;

    public Operation(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                op = ch;
                a = Integer.parseInt(expression.substring(0, i));
                b = Integer.parseInt(expression.substring(i + 1));
                break;
            }
        }
    }

    public int calculate() {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }
}
