package Functions;
import java.util.*;
public class table {
    static void table1(int num){
        // int result;
        for(int i=1; i<=10; i++){
        
            System.out.println(num +" X " + i + " = "+ num*i);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of number: ");
        int num = sc.nextInt();

        table1(num);
        sc.close();
    }
}
