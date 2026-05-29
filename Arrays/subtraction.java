import java.util.*;

// Subtract two arrays element-wise and return the result as a new array  -> here borrow concept is not used

public class subtraction {
    static int[] sub(int[] arr1,int[] arr2){
        int[] res= new int[arr1.length];

        // element-wise subtraction
        // method 1 
        for(int i=0;i< arr1.length;i++){
            res[i] = arr1[i] - arr2[i];
        }

        // for borrow concept we can use the below code - elemnt-wise subtraction with borrow
        // method 2
        for(int i= arr1.length-1; i>=0; i--){
            if(res[i] < 0){
                res[i] += 10; // borrow
                if(i-1 >= 0){
                    res[i-1] -= 1; 
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i< n; i++){
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        System.out.println("Enter elements for the second array: ");
        for(int i=0; i< n; i++){
            arr2[i] = sc.nextInt();
        }
        String ans = Arrays.toString(sub(arr1,arr2));
        System.out.println(ans);

        sc.close();

    }
}