package PATTERNS;

public class pattern4 {
    public static void main(String[] args){
        // 1
        // 12
        // 123
        // 1234
         for(int i=1;i<=4;i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);      
            }
            System.out.println();
        }

        
        // reverse:
        // 1234
        // 123
        // 12
        // 1
        // System.out.println("Reverse pattern: ");        
        // for(int i=4; i>=1; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    }
}
