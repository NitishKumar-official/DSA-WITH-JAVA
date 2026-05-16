public class A08_minAnd2Min {

    public static void minand2min(int arr[]){
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min2 = min;
                min = arr[i];
            }
            else if (arr[i] < min2 && arr[i] != min)
                min2 = arr[i];
        }
        System.out.println(min+" "+ min2);
    }
    public static void main(String[] args) {
        int arr[] ={2,4,3,5,6};
        minand2min(arr);
    }
}
