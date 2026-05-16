public class A11_Remove_duplicate{

    public static void RemoveDublicate(int []arr){
        int n = arr.length;
        int idx =1;
        for(int i =1; i<n; i++){
            if(arr[i]!=arr[i-1]){
                arr[idx++] = arr[i];
            }
        }
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] =  {1, 2, 2, 3, 4, 4, 4, 5, 5};
        RemoveDublicate(arr);
    }
}