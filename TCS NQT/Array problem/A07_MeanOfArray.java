public class A07_MeanOfArray {

    public static void findMean(int arr[]){
        int sum =0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        int mean = sum/n;
        System.out.println(mean);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,6,5,8,7};
        findMean(arr);
    }
}
