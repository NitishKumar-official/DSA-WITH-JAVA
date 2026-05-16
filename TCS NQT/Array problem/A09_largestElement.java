public class A09_largestElement {
     public static void largest(int[] arr) {
        // code here
        int large = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            if(arr[i]>large){
                large = arr[i];
                
            }
        }
        System.out.println(large);
    }
    public static void main(String[] args) {
        int arr[] = {1,5,8,9,6,3,7};
        largest(arr);
    }
}
