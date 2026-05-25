package SwitchCase;
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();

        // Find operator position
        int opIndex = -1;
        char op = ' ';
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                opIndex = i;
                op = c;
                break;
            }
        }

        // take as A and B : 
        int A = Integer.parseInt(expr.substring(0, opIndex));
        int B = Integer.parseInt(expr.substring(opIndex + 1));

        int result = 0;
        switch (op) {
            case '+': result = A + B; break;
            case '-': result = A - B; break;
            case '*': result = A * B; break;
            case '/': result = A / B; break; // integer division
        }

        System.out.println(result);

        sc.close();
    }
}
