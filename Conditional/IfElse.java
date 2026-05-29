
import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 10;
// CONDITIONAL STATEMENTs
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        //  bit-wise OR operator
//         int x = 10;
//        int y = 4;
//        int z = 1;
//        if(x>5 | ++x > 100){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }

//     int num = sc.nextInt();
//        float div = num/3;
//        System.out.println(div);
//        int num2 = -10%3;
//        System.out.println(num2);


    //    C to F
//        System.out.println("Enter value of C: ");
//        float c = sc.nextFloat();
//        float f = (c * (9/5))+32;
//        System.out.println(f);

       // F to C
//         System.out.println("Enter value of F: ");
//         float f2 = sc.nextFloat();
//         float c2 = (f2 - 32) * (5/9);
//         System.out.println(c2);

    // int marks = 56;
    // if(marks >= 90){
    //     System.out.println("Grade A");
    // }else if(marks>= 80 && marks < 90){
    //     System.out.println("Grade ");
    // }else if(marks >= 70 && marks < 80){
    //     System.out.println("Grade C");  
    // }

    sc.close();
}
}