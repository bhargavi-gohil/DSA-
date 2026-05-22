package Loops;
import java.util.*;
public class Addition {
    public static void main(String[] args){

        // sum of whole numbers from 1 to 20
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 1;
        for(int i =  0;i <= number; i++){
            sum *= i;
        }
        System.out.println("sum : "+ sum);
        sc.close();
    }
}
