

public class A03_equilibriumPoint {
    // public static void checkEqulibrium(int arr[]){
    //     int n = arr.length;
    //     for(int i=0; i<n; i++){
    //         //leftsum
    //         int leftsum =0;
    //         for(int j=0;j<=i; j++){
    //             leftsum += arr[j];
    //         }
    //         //rightsum
    //         int rightsum =0;
    //         for(int k=i+1; k<n; k++){
    //             rightsum += arr[k];
    //         }
    //         //check sum is equlity
    //         if(leftsum == rightsum){
    //             System.out.println("Equilibrium point is"+ arr[i]);
    //             return;
    //         }
    //     }
    // }
    public static void checkEqulibrium(int arr[]){
        int n = arr.length;
        int sum[] = new int[n];

        sum[0] = arr[0];
        for(int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }


        for(int i=0; i<n; i++){
            if(sum[i]==(sum[n-1]-sum[i])){
                System.out.println("Equilibrium point is"+ arr[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,0,3};
        checkEqulibrium(arr);
    }
}
