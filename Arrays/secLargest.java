package Arrays;
// IF ARRAY ELEMENTS ARE GREATER THAT ZERO (ONLY VALID FOR POSITIVE INTEGERS)
public class secLargest {

    // --------------------------------------------------- MATHOD 1 -----------------------------------------------------------
    public static void SecondLargest(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println(second);
    }
    // ------------------------------------------------------------ METHOD 2 -----------------------------------------------------------
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int largest = arr[0];
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            if( arr[i] > largest || arr[i] != largest){
                temp = largest;
                largest = arr[i];
            }
            // System.out.println(Largest);
        }
        System.out.println(temp);
    }
}
