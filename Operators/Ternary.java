package Operators;

// import java.util.*;
public class Ternary {
    public static void main(String[] args){
        // max
    //    int number1 = 10;
    //    int number2 = 20;
    //    int number3 = 100;
    //    String result = (number1 > number2 ? "Greater" : "Smaller");

//        int result2 = (number1 > number2 ?number1 : number2);
//        System.out.println(result2 > number3 ? result2 : number3);

       // method 2
       int num1 = 5;
       int num2 = 7;
       int num3 = 10;
       int result2 = ((num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 : num3);
       System.out.println(result2);

        //  Find eligible for voting or not
        int age = 22;
        String eligible = (age >= 18 ? "Eligible" : "Not Eligible");
       System.out.println(eligible);

 // increment/decrement/both --> use 

        // int n1 = 2;
//        n1++; // 24
//        ++n1; // 25
//        System.out.println(n1);
        // int n2 = 4;
//        n2++; // 3
//        ++n2; // 4
//        System.out.println(n2);

//        int res = n1+n2;
//        System.out.println(res);
        // n1 = 2, n2 = 4
//        int result = n1++ + n2++ + ++n1 + ++n2 + n1 + n2 + n1++ + n1 + ++n2 + n2;
        // 2 + 4 + 3 + 5 + 3 + 5 + 3 +




    }
}
