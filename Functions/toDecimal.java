package Functions;

public class toDecimal {
    public static int Decimal(String num, int currentBase) {

        int decimal = 0;
        int power = 1;

        // Traverse from right to left
        for (int i = num.length() - 1; i >= 0; i--) {

            char ch = num.charAt(i);

            int digit;

            // Convert character to integer value
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else {
                digit = ch - 'A' + 10;
            }

            decimal = decimal + (digit * power);

            power = power * currentBase;
        }

        return decimal;
    }
    public static void main(String[] args) {
        // System.out.println(Decimal("123",10));
    }
}
