import java.util.*;

public class A05max_min_subArray {

    public static void makeSubarray(int arr[]) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {

                    sum = arr[k] + sum;
                    System.out.println(sum);
                }
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
