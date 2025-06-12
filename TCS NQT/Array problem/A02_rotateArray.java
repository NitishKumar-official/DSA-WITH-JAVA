
public class A02_rotateArray {
    // public static void rotateArr(int arr[], int d) {
    //     // add your code here
    //     for(int i=0; i<d; i++){
    //         int first = arr[0];
    //         for(int j=0; j<arr.length-1; j++){
    //             arr[j] = arr[j+1];
    //         }
    //         arr[arr.length-1] = first;
    //     }
    // }

    public static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;

        d %= n;
        int temp[] = new int[n];

        for(int i=0; i<n-d; i++){
            temp[i] = arr[d+i];
        }
        for(int i=0;i<d; i++){
            temp[n-d+i] = arr[i];
        }

        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        rotateArr(arr, d);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
