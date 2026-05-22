package Loops;
import java.util.*;
public class  basicLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i <= 5){
           System.out.println(i);
           i++;
        }
        //  do-while loop
        i = 2;
        do{
            System.out.println(i);
            i++;
        }while(i <= 5);

        // 
        // while loop question : 
        // battery 10% ---> 100% , per min ->10% increase   

        int battery = sc.nextInt();
        int minutes = 0;
        while(battery < 100){
            battery += 10;
            minutes++;
        }
        System.out.println("Min : "+ minutes);

        sc.close();
    }

}
