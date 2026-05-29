// Write a program to find out the shortest distance between two even positive integers 
// in an array arr and print the distance. 
// If there is one or zero even positive integer in the array then return -1.
import java.util.*;
public class FindDistance {
     public static int min(int num1,int num2){
       return (num1 > num2 ? num2 : num1);  //
    }
    
    public static int shortestDistance(int[] arr,int n){
        int res = Integer.MAX_VALUE;   //  start with large value
        int prev = -1;               
        
        for(int i=0; i<n; i++){
            if(arr[i] > 0 && arr[i] % 2 == 0){   // even positive
                if(prev != -1){
                    res = min(res, i - prev);    // distance
                }
                prev = i; // update last even index
            }
        }
        
        return (res == Integer.MAX_VALUE ? -1 : res);  // return -1 if not found
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(shortestDistance(arr, n));  // 

        sc.close();
    }
}
