
/*
========================================================
PROBLEM: Squares of a Sorted Array
========================================================

Given:
A sorted integer array nums
(in non-decreasing order)

Task:
Return an array of squares of each number
also in sorted order.

--------------------------------------------------------
EXAMPLE 1
--------------------------------------------------------

Input:
nums = [-4,-1,0,3,10]

Square:
[16,1,0,9,100]

Sorted Output:
[0,1,9,16,100]

--------------------------------------------------------
EXAMPLE 2
--------------------------------------------------------

Input:
nums = [-7,-3,2,3,11]

Output:
[4,9,9,49,121]

========================================================
IMPORTANT OBSERVATION
========================================================

Negative numbers become positive after square.

Example:

-7² = 49
11² = 121

So:
Largest square may come from:
- left side
OR
- right side

========================================================
APPROACH 1 : BRUTE FORCE
========================================================

IDEA:
1. Square every element
2. Sort the array

--------------------------------------------------------
TIME COMPLEXITY
--------------------------------------------------------

Squaring -> O(n)
Sorting  -> O(n log n)

Total:
O(n log n)

--------------------------------------------------------
SPACE COMPLEXITY
--------------------------------------------------------

O(1) extra space
(ignoring output array)

========================================================
*/

import java.util.*;

class A06_Square_of_Array {

    public int[] sortedSquares(int[] nums) {

        // square each element
        for(int i = 0; i < nums.length; i++) {

            nums[i] = nums[i] * nums[i];
        }

        // sort array
        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {

        A06_Square_of_Array obj =
                new A06_Square_of_Array();

        int[] nums = {-4,-1,0,3,10};

        int[] ans = obj.sortedSquares(nums);

        System.out.println(Arrays.toString(ans));
    }
}

/*
========================================================
PROBLEM: Squares of a Sorted Array
========================================================

Given:
A sorted integer array

Return:
Squares of each number
in sorted order.

========================================================
APPROACH 2 : TWO POINTER APPROACH (OPTIMAL)
========================================================

MOST IMPORTANT APPROACH

--------------------------------------------------------
IMPORTANT OBSERVATION
--------------------------------------------------------

Largest square always comes from:
- leftmost negative number
OR
- rightmost positive number

Why?

Because:
larger absolute value => larger square

Example:

nums = [-7,-3,2,3,11]

Squares:
49,9,4,9,121

Largest:
121 comes from 11

--------------------------------------------------------
IDEA
--------------------------------------------------------

Use:
left  -> start
right -> end

Compare:
Math.abs(nums[left])
and
Math.abs(nums[right])

Whichever is bigger:
put its square at end of answer array.

--------------------------------------------------------
DRY RUN
--------------------------------------------------------

nums = [-4,-1,0,3,10]

Compare:
|-4| = 4
|10| = 10

10 bigger

Place:
100 at end

Move right--

--------------------------------------------------------
TIME COMPLEXITY
--------------------------------------------------------

O(n)

--------------------------------------------------------
SPACE COMPLEXITY
--------------------------------------------------------

O(n)

========================================================


import java.util.*;

class SquaresSortedArrayTwoPointer {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;

        // answer array
        int[] ans = new int[n];

        // left pointer
        int left = 0;

        // right pointer
        int right = n - 1;

        // fill answer from end
        int index = n - 1;

        // loop until pointers cross
        while(left <= right) {

            // square values
            int leftSquare = nums[left] * nums[left];

            int rightSquare = nums[right] * nums[right];

            // place larger square at end
            if(leftSquare > rightSquare) {

                ans[index] = leftSquare;

                left++;
            }

            else {

                ans[index] = rightSquare;

                right--;
            }

            // move index backward
            index--;
        }

        return ans;
    }

    public static void main(String[] args) {

        SquaresSortedArrayTwoPointer obj =
                new SquaresSortedArrayTwoPointer();

        int[] nums = {-4,-1,0,3,10};

        int[] ans = obj.sortedSquares(nums);

        System.out.println(Arrays.toString(ans));
    }
}*/