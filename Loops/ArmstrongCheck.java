package Loops;
import java.util.*;
public class ArmstrongCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Armstrong number check
            int num = sc.nextInt();
            int sum = 0;

            while(num > 0){
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }
            System.out.println("Sum of cubes of digits: " + sum);
            if(sum == num){
                System.out.println("Armstrong number" + sum);
            }else{
                System.out.println("Not Armstrong number");
            }

            sc.close();
    }
}
