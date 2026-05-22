package Loops;
// import java.util.*;
public class PerfectSquareCube {
    public static void main(String[] args){
        // perfect squares between 20 and 80
        System.out.println("Perfect square between 20 to 80 :");
        for(int i = 1; i <= 1000; i++){
            int sq = i * i;
        
            if(sq >= 20 && sq <= 80){
                System.out.println(sq);
            }
            if(sq > 80) break;
        }

        // check perfect cube :
            // int num = sc.nextInt();
            for(int i =1; i<=1000; i++){
                if(i*i*i >= 1 && i*i*i <= 2000){  
                    // print all perfect cube from 1 to 1000
                    System.out.println("Perfect Cube:  "+(i*i*i)); 
                    // System.out.println(i*i*i); 
                    // break;
                }
            }
    } 
}
