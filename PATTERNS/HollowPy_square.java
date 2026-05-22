package PATTERNS;

public class HollowPy_square {
     public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==1 || i==n || j==1 || j==i){
                    System.out.print("*" + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Hollow Square: ");
        // HOLLOW SQUARE :
          for(int i=1;i<=n;i++){
            for(int j= 1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*" + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}
