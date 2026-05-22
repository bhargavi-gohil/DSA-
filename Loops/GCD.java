package Loops;
import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // GCD of two numbers
            System.out.print("Enter two numbers: ");
            int num1 = sc.nextInt();
            int num2  = sc.nextInt();
            int min = Math.min(num1,num2);
            int GCD = 1;
            // // while (num1 > 0 && num2 > 0){  -> condition -> Math.min(num1,num2)
            for(int i=1; i<= min; i++){
                if(num1 % i == 0 && num2 % i == 0){
                    GCD = i;
                }
            }
            System.out.println("GCD : " + GCD);

            sc.close();
    }
}
