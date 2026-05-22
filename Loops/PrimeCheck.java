package Loops;
import java.util.*;
public class PrimeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // prime number check
        int number = sc.nextInt();
        Boolean isPrime = true;
        // while(number > 0){
        //     if(number == 2 || number != 1)
        //     {
        //         System.out.println("Prime");
        //         break;
        //     }
        // }
        //  METHOD 2 : WITH FOR LOOP
         for(int i = 2; i < number; i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
        }
        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }

        sc.close();
    }
    
}
