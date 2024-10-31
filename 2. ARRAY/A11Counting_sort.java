public class A11Counting_sort {

    public static void CountSort(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        int[] countArray = new int[maxi + 1];
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] > 0) {
                arr[j] = i;
                j++;
                countArray[i]--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 6, 2, 6, 5, 8, 1 };
        CountSort(arr);

    }

}
