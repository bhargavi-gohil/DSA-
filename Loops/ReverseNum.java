package Loops;
import java.util.*;

public class ReverseNum{
    public static void main(String[] args){
        // Reverse a number
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;
        while(number > 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}