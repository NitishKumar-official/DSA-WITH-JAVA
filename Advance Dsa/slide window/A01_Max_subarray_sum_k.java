
/*
========================================================
PROBLEM: Maximum Sum Subarray of Size K
========================================================

Given:
An integer array nums[]
and an integer k

Task:
Find the maximum sum of any contiguous
subarray of size k.

--------------------------------------------------------
WHAT IS CONTIGUOUS SUBARRAY?
--------------------------------------------------------

Elements should be continuous.

Example:

nums = [2,1,5,1,3,2]

Subarray of size 3:
[2,1,5]
[1,5,1]
[5,1,3]
[1,3,2]

--------------------------------------------------------
EXAMPLE
--------------------------------------------------------

Input:
nums = [2,1,5,1,3,2]
k = 3

Output:
9

--------------------------------------------------------
EXPLANATION
--------------------------------------------------------

Subarrays of size 3:

[2,1,5] -> sum = 8
[1,5,1] -> sum = 7
[5,1,3] -> sum = 9
[1,3,2] -> sum = 6

Maximum = 9

========================================================
APPROACH 1 : BRUTE FORCE
========================================================

IDEA:
1. Generate every subarray of size k
2. Calculate sum for each subarray
3. Track maximum sum

--------------------------------------------------------
TIME COMPLEXITY
--------------------------------------------------------

Outer loop  -> O(n)
Inner loop  -> O(k)

Total:
O(n * k)

--------------------------------------------------------
SPACE COMPLEXITY
--------------------------------------------------------

O(1)

========================================================
*/

import java.util.*;

class A01_Max_subarray_sum_k {

    public int maximumSumSubarray(int[] nums, int k) {

        int n = nums.length;

        // store maximum sum
        int maxSum = Integer.MIN_VALUE;

        // generate every subarray
        for(int i = 0; i <= n - k; i++) {

            int currentSum = 0;

            // calculate sum of size k
            for(int j = i; j < i + k; j++) {

                currentSum += nums[j];
            }

            // update maximum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        A01_Max_subarray_sum_k obj =
                new A01_Max_subarray_sum_k();

        int[] nums = {2,1,5,1,3,2};

        int k = 3;

        System.out.println(
                obj.maximumSumSubarray(nums, k));
    }
}

/*
/*
========================================================
PROBLEM: Maximum Sum Subarray of Size K
========================================================

Given:
An array nums[]
and window size k

Find:
Maximum sum of any subarray of size k

========================================================
APPROACH 2 : SLIDING WINDOW (OPTIMAL)
========================================================

MOST IMPORTANT APPROACH

--------------------------------------------------------
IMPORTANT OBSERVATION
--------------------------------------------------------

While moving to next subarray:

One element leaves window
One element enters window

So:
No need to calculate sum again and again.

--------------------------------------------------------
IDEA
--------------------------------------------------------

1. Calculate first window sum
2. Slide window one step ahead
3. Remove left element
4. Add next right element
5. Track maximum sum

--------------------------------------------------------
WHY CALLED SLIDING WINDOW?
--------------------------------------------------------

Because window slides like this:

[2,1,5]
   [1,5,1]
      [5,1,3]
         [1,3,2]

--------------------------------------------------------
DRY RUN
--------------------------------------------------------

nums = [2,1,5,1,3,2]
k = 3

First window:
[2,1,5]
sum = 8

Move window:

Remove 2
Add 1

New sum:
7

Move again:

Remove 1
Add 3

New sum:
9

--------------------------------------------------------
TIME COMPLEXITY
--------------------------------------------------------

O(n)

--------------------------------------------------------
SPACE COMPLEXITY
--------------------------------------------------------

O(1)

BEST APPROACH

========================================================


import java.util.*;

class MaxSumSubarraySlidingWindow {

    public int maximumSumSubarray(int[] nums, int k) {

        int n = nums.length;

        // calculate first window sum
        int windowSum = 0;

        for(int i = 0; i < k; i++) {

            windowSum += nums[i];
        }

        // maximum sum
        int maxSum = windowSum;

        // slide window
        for(int end = k; end < n; end++) {

            // remove left element
            windowSum -= nums[end - k];

            // add new right element
            windowSum += nums[end];

            // update maximum
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        MaxSumSubarraySlidingWindow obj =
                new MaxSumSubarraySlidingWindow();

        int[] nums = {2,1,5,1,3,2};

        int k = 3;

        System.out.println(
                obj.maximumSumSubarray(nums, k));
    }
}
 */