public class A01_change_arr {

    public static void changeArray(int arr[], int idx, int val){
        //base case 
        if(idx == arr.length){
            printArr(arr);
            return;
        }

        arr[idx] = val;
        changeArray(arr, idx+1, val+1);
        arr[idx] = arr[idx] -2;
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5]; 
        changeArray(arr,0, 1);
        System.out.println();
        printArr(arr);
    }
    
}
