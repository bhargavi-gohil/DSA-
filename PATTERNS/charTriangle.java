package PATTERNS;

public class charTriangle {
    public static void main(String[] args){
        // ABCD
        // ABC ..

        /* REVERSE TRIANGLE OF CHARACTER */
        int n = 5;
         for(int i = 1; i <= n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
    
}
