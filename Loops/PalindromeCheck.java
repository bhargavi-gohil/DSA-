package Loops;
import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Palindrome number check 
        // Palindrome number -> 
            System.out.print("Original number: ");
            int num = sc.nextInt();
            int rem;
            int rev = 0;
             while(num > 0){
                rem = num % 10;
                rev = rev*10 + rem;
                num /= 10;
            }
            System.out.println("rev: " + rev);
            if(num == rev){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not Palindrome");
            }

            sc.close();
    }
}
