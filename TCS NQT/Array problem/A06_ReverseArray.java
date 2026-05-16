public class A06_ReverseArray {
    public static void reverseArray(int[] arr){
        int n = arr.length;
        for(int i=0, j=n-1; i<j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
    }
}
