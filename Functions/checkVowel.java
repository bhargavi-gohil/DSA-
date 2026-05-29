package Functions;
import java.util.*;
// character is vowel or not
public class checkVowel {
    static boolean isVowel(char ch){
        if(ch == 'a'|| ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' ||
         ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U' ){
            // System.out.println(ch +" is a Vowel.");
            return true;
        }else{
            // System.out.println(ch+ " is NOT a Vowel.");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if(isVowel(ch) == true){
            System.out.println(ch +" is a vowel.");
        }else{
            System.out.println(ch +" not a vowel");
        }
        sc.close();
    }
}
