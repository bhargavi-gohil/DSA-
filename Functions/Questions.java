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
    // --------------------------- decimal to binary ------------------------------------------------
    public static int binary(int num){
        int ans = 0;
        int place = 1;
        while(num > 0){
            int rem = num % 2;
            ans = ans+rem*place;
            place *= 10; // update place value...
            num /= 2;
        }
        return ans;
    }
    // ------------------------- Binary to decimal ----------------------------------------
    public static int decimal(int num){
        int ans = 0;
        int place = 1;
        while(num > 0){
            int digit = num % 10;
            ans = ans + digit*place;
            place = place*2;
            num /= 10;
        }
        return ans; 
        // Method 2 String --> at GFG
    }
    // ------------------------ decimal to octal ---------------------------------
     public static int octal(int num){
        int ans = 0;
        int place = 1;
        while(num > 0){
            int rem = num % 8;
            ans = ans+rem*place;
            place *= 10; // update place value...
            num /= 8;
        }
        return ans;
    }
    //=----------------------------- octal to decimal -------------------------------------------
   public static int octalTodecimal(int num){
        int place = 1;
        int ans = 0;

        int base = 10;

        while(num > 0){
            int remainder = num % base;
            ans = ans + place * remainder;
            place = place * 8;
            num = num/10;
        }
        return ans;
   }
    
    // -------------------- Octal to Binary --> decimal -------------------------------------------------------
    //  



    public static void main(String[] args) {
        // System.out.println("Sum of Even number: ");
        // System.out.println(add(1,10));  // sum of even num

        // System.out.println(count(22)); // count digit
        // System.out.println(npr(1,2)); // npr
        // System.out.println(ncr(1,2)); // ncr

        // System.out.println(conc("saumya!"));

        // System.out.println(check(245));
        // System.out.println(replaceZero(250));
        // System.out.println(binary(50));  // decimal to binary
        // System.out.println(decimal(1010));  // binary to decimal
        System.out.println(octal(800));
    }
}