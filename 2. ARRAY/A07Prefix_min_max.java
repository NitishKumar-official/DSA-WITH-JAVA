import java.util.*;

public class A07Prefix_min_max {

    public static void makeSubarray(int arr[]) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max" + max + " " + "min=" + min);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 3, 10 };
        makeSubarray(arr);
    }

}
