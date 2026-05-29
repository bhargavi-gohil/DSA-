package Arrays;
/*  
--> int[] arr; - array declaration
--> int[] arr = new int[n]; --> initialize (empty!)
--> arr.length -> attribute
--> 0 base indexing
--> 
 */
import java.util.*;
public class Day1 {
    public static void linearSearch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static boolean linearSearch2(int n,int target){
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                return true;
            }
            System.out.println("Index Value: "+i);
        }
        return false;
    }
    // ---------- Find element at a given Index -----------------------------
    public int findElementAtIndex(int i, int[] arr) {
       return arr[i];
    }
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter size of array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Array Elements: ");
        // for(int i=0; i<n; i++){
        //     if(arr[i]%2 == 0){
        //     System.out.print(arr[i]+" ");
        //     }
        //     }
        // }
        linearSearch();
        System.out.println(linearSearch2(4,5));
    }
}

