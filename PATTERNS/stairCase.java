package PATTERNS;
import java.util.*;
 // hw : staircase --> 2 increment --> i % 2 ==> stars+= 2;
public class stairCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int stars = 2;
        for(int i = 1; i<= n; i++){
            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i % 2 == 0){
                stars += 2;
            }
        }
        sc.close();
    }
}
