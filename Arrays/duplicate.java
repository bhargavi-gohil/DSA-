package Arrays;
// You have been given an array arr that might contain duplicate elements. Your task is to 
// find the maximum possible distance between occurrences of two repeating elements 
// i.e. elements having the same value. If there are no duplicate elements in the array, print 0

import java.util.*;

public class duplicate {
    public static int max(int num1,int num2){
       return (num1 > num2 ? num1 : num2);
    }
    public static int FindDistance(int[] arr){
        int res = 0;
        for(int i=0; i<arr.length; i++){
            int search  = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] == search){
                    res = max(res,j-i);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(FindDistance(arr));

        sc.close();
    }
}
