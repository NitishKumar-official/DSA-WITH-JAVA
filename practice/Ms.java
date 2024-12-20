public class Ms {


    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    public static void merge_sort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        //calculate mid
        int mid = si + (ei-si)/2;
        //divide left part
        merge_sort(arr, si, mid);
        //divide right part
        merge_sort(arr, mid+1, ei);

        // conqor and merge

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];
        int i=si;
        int j=mid+1;
        int k =0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }

       
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,6,7,8,56,6,2,5,8};
        System.out.println("unsorted array");
        print(arr);
        
        //merge sort
        merge_sort(arr, 0, arr.length-1);
        System.out.println("sorted array");
        print(arr);

    }
    
}