class NumberChecker {
    private int number;

    public NumberChecker(int number) {
        this.number = number;
    }

    public void checkFirstDigitEvenOrOdd() {
        String numStr = String.valueOf(number);
        char firstChar = numStr.charAt(0);
        int firstDigit = Character.getNumericValue(firstChar);

        if (firstDigit % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}