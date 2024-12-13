
public class Merge_sort {

    public static void Merge(int arr[], int mid, int si, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for left single element

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // for right single element

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arry

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void Merge_Sort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        // left part
        Merge_Sort(arr, si, mid);
        // right part
        Merge_Sort(arr, mid + 1, ei);
        Merge(arr, mid, si, ei);
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 3, 4, 97, 63, 3 };
        Merge_Sort(arr, 0, arr.length - 1);
        print(arr);

    }

}
