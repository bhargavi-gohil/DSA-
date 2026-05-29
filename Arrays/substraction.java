package Arrays;
import java.util.*;
// Subtracting 2 different array of different size, borrow concept 
public class substraction {
    public static int[] calSub(int[] arr1,int[] arr2,int n,int m){
        // int sub = 0;
        // for(int i=0; i<arr1.length;i++){
        //     sub -= i;
        // }
        // for(int i=0; i<arr1.length; i++){
        //     arr1[i] = sub
        // }
        int[] res = new int[Math.max(n, m) + 1];
        int i = n -1 ;
        int j = m - 1;
        int k = res.length - 1;
        int borrow = 0;
      
        while(i >= 0 || j>=0 || borrow > 0){
            int sub = borrow;
            if(i >= 0) {
                sub = sub - arr1[i];
                i--;
            }
            if(j >= 0){
                sub = sub - arr2[j];
                j--;
            }
            res[k] = sub % 10;
            borrow = sub/10;
            k--;
        }
      int sz = res.length;
      if(res[0] == 0){
          int[] ans = new int[sz-1];
          for(int x = 1; x < sz; x++){
              ans[x-1]=res[x];
          }
          return ans;
      }
      return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        
        System.out.println("Enter Elements of Arr1: ");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter Elements of Arr2: ");
         for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }

        int[] res = calSub(arr1, arr2, n, m);
        for (int i : res) System.out.print(i+" ");

        sc.close();
    }
}
