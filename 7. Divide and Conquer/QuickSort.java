public class QuickSort {
    
    public static void Quick_sort(int arr[], int si, int ei){

        if(si >= ei){
            return;
        }

        int PIdx = partition(arr, si, ei);
        Quick_sort(arr, si, PIdx - 1);  // Left side
        Quick_sort(arr, PIdx + 1, ei); // Right side
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[si];  // Pivot is chosen to be the last element
        int i = si - 1;       // Index of the smaller element
        
        // Loop through the array and partition based on pivot
        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){  // If current element is smaller than or equal to pivot
                i++;              // Increment the smaller element index
                // Swap the elements at i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot element in its correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        // Return the index of the pivot element
        return i;
    }

    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {5, 6, 3, 5, 48, 95, 63, 45};
        System.out.println("Unsorted array:");
        print(arr);
        
        Quick_sort(arr, 0, arr.length - 1);  // Perform Quick Sort
        System.out.println("Sorted array:");
        print(arr);
    }
}
