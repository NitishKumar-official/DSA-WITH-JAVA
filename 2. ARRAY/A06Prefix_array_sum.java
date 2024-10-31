
public class A06Prefix_array_sum {

    public static void makePrifixArray(int arr[]) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(prefix[i] + " ");
        }

    }

    public static void main(String[] args) {

        int arr[] = { 5, 6, 8, 7, 9 };

        makePrifixArray(arr);
    }
}