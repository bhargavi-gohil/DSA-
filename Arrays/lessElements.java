package Arrays;

import java.util.Scanner;

// Write a program to count all elements in array less than X.
public class lessElements {
    public static int count(int[] arr,int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(count(arr, 5));

        sc.close();
    }
}
