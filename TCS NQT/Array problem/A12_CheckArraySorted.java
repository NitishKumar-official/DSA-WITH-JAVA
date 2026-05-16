public class A12_CheckArraySorted {

    public static boolean CheckSorted(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        if(CheckSorted(arr)){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
}
