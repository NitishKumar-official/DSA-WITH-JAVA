public class A04_RightRotatedArray{

    public static void  RightRotated(int arr[], int k){
        int n = arr.length;
        // for(int i =0; i<k; i++){
        //     int last = arr[n-1];
        //     for(int j=n-1; j>0; j--){
        //         arr[j] = arr[j-1];
        //     }
        //     arr[0] = last;
        // }

        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i]+ " ");
        // }

        int temp[] = new int[n];

        for(int i=0; i<k; i++ ){
            temp[i] = arr[n-k+i];
        }
        // Step 2: Shift the first (n - k) elements to the right
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }

        // Step 3: Copy temp elements back to original array
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String []args){
        int arr[] = {1,3,5,7,9};
        int k =2;
        RightRotated(arr,k);
    }
}