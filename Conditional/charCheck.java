import java.util.*;
public class charCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char X = sc.next().charAt(0);

        // if(x - 'A' == 32){
        //     System.out.println("A");
        // }else{
        //     System.out.println("a");
        // }

        if (X >= 'a' && X <= 'z') {
            // lowercase → convert to uppercase
            System.out.println((char)(X - 32));
        } else if (X >= 'A' && X <= 'Z') {
            // uppercase → convert to lowercase
            System.out.println((char)(X + 32));
        }
        sc.close();
    }
}

