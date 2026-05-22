package Loops;
// Loops in java --> 1. for loop, 2. while loop, 3. do-while loop
public class sumof3 {
     public static void main(String[] args){
        //  1 to 20
        int sum = 0;
        for(int i=0; i<=20; i++){
           if(i%3==0){
               sum += i;
           }
        }
         System.out.println("sum of multiple of 3 :" + sum);
     }
}
