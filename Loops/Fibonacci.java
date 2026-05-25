package Loops;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         // Fibonacci series
         /* Addition of previous number --> like 0+1->+ 1->+ 2 -> 3 */
        System.out.print("Enter terms:  ");
        int terms = sc.nextInt();
        int first = 0;
        int second = 1;
        for(int i = 1;i <= terms; i++){
            System.out.print(first + " "); // here only show 0 1 1
            int sum = first + second;
            first = second;
            second = sum;
        }

        // if user enter for 3 terms it will print 0 1 1 2
        // System.out.print(first + " "); // 0 1 1 2
        

        // int[] fib = new int[umber];
        // if(number >= 1) fib[0]=0;
        // if(number >= 2) fib[1] = 1;
        
        // for(int i=2; i<number; i++){
        //     fib[i] = fib[i - 1]+ fib[i - 2];
        // }
        sc.close();
    }
}
