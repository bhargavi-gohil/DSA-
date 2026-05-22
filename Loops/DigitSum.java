package Loops;
import java.util.*;

public class DigitSum {
    public static void main(String[] args){
        // Digit sum
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}
