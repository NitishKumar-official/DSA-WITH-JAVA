import java.util.*;

public class A01_01_Knapsack {

    public static int knapsack(int val[], int wt[], int W, int n) {
        // Base case: no capacity or no items left
        if (W == 0 || n == 0) {
            return 0;
        }

        // Check if the current item's weight is valid
        if (wt[n - 1] <= W) {
            // Include the current item
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);
            // Exclude the current item
            int ans2 = knapsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else {
            // Exclude the current item (correction made here)
            return knapsack(val, wt, W, n - 1);
        }
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(knapsack(val, wt, W, val.length));
    }
}
