package Loops;
import java.util.*;

public class Factorial {
    public static void main(String[] args){
          // Factorial of a number5
        // 5! = 5*4*3*2*1 => 120
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;
        for(int j=1; j<=number; j++){
            factorial *= j;
        }
        while(number > 0){
            factorial *= number;
            number--;
        }
        System.out.println("Factorial: " + factorial);

        sc.close();
    }
}
