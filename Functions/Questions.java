/*--------------------------------------  WRITE CODE WITH THE HELP OF FUNCTIONS  -------------------------------------------------------*/
package Functions;
// import java.util.*;
public class Questions{

    public static int add(int start,int end){
        int sum = 0;
        for(int i = start; i<= end; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
    // ---------------------Count digit of number! ------------------------
    public static int count(int num){
        int count = 0;
    
        while(num > 0){
            int DIGIT = num % 10;
            num /= 10;
            count++;
        }
        return count;
    }

    //----------------------- permutation and comb -> n!/(n-r)! , (n!)/(n-r)! (r!) ------------------
    public static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    public static int npr(int n1,int r){
        int fact_n = fact(n1);
        int fact_n_r = fact(n1 - r);
        return fact_n / fact_n_r;
    }
    public static int ncr(int n2,int r2){
        int fact_n = fact(n2);
        int fact_r = fact(r2);
        int fact_n_r = fact(n2 - r2);
        return fact_n / (fact_r * fact_n_r);
    }

    // ------------------------------------------- String concat ------------------------------------------
    public static String conc(String name){
        return ("Hello "+name);
    }
    
    // ---------------------------------- second last digit is even or not (boolean)-------------------------
    public static boolean check(int number){
        if((number/10) % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }


    //------------------------------------- replace 0 --> 5 -------------------------------------------
    public static int replaceZero(int num){
        if(num == 0){
            return 5;
        }
        int res = 0;
        int place = 1;
        while(num > 0){
            int digit = num % 10;
            if(digit == 0){
                digit = 5;
            }
            res = res +  digit * place;
            place *= 10;
            num /= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        // System.out.println("Sum of Even number: ");
        // System.out.println(add(1,10));  // sum of even num

        // System.out.println(count(22)); // count digit
        // System.out.println(npr(1,2)); // npr
        // System.out.println(ncr(1,2)); // ncr

        // System.out.println(conc("saumya!"));
        // System.out.println(check(245));
        // System.out.println(replaceZero(250));
    }
}