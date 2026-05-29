import java.util.*;
public class ElementSum{
    public static void sumArray(int[] arr) {
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = sum - arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sumArray(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}