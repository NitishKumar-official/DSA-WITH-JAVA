
/*
========================================================
PROBLEM: Merge Sorted Array
========================================================

Given:
Two sorted arrays

Merge nums2 into nums1
in sorted order.

========================================================
APPROACH 2 : TWO POINTER FROM END (OPTIMAL)
========================================================

MOST IMPORTANT APPROACH

--------------------------------------------------------
IMPORTANT OBSERVATION
--------------------------------------------------------

nums1 already has extra space at end.

So:
Instead of shifting elements again and again,
start filling from BACK.

--------------------------------------------------------
WHY FROM END?
--------------------------------------------------------

Because:
Largest elements are at the end.

If we fill from front:
elements may overwrite.

From back:
safe insertion possible.

--------------------------------------------------------
IDEA
--------------------------------------------------------

Use 3 pointers:

i -> last valid element in nums1
j -> last element in nums2
k -> last index of nums1

--------------------------------------------------------
LOGIC
--------------------------------------------------------

Compare:
nums1[i]
nums2[j]

Whichever is bigger:
put at nums1[k]

Move pointer backward.

--------------------------------------------------------
DRY RUN
--------------------------------------------------------

nums1 = [1,2,3,0,0,0]
nums2 = [2,5,6]

Compare:
3 and 6

6 bigger

Place:
nums1[5] = 6

--------------------------------------------------------
TIME COMPLEXITY
--------------------------------------------------------

O(m + n)

--------------------------------------------------------
SPACE COMPLEXITY
--------------------------------------------------------

O(1)

BEST APPROACH

========================================================
*/

import java.util.*;

class AO7_Merge_two_sortedArray {

    public void merge(int[] nums1, int m,
                      int[] nums2, int n) {

        // pointer for nums1 valid elements
        int i = m - 1;

        // pointer for nums2
        int j = n - 1;

        // pointer for final position
        int k = m + n - 1;

        // merge from back
        while(i >= 0 && j >= 0) {

            // larger element goes at end
            if(nums1[i] > nums2[j]) {

                nums1[k] = nums1[i];

                i--;
            }

            else {

                nums1[k] = nums2[j];

                j--;
            }

            k--;
        }

        // remaining nums2 elements
        while(j >= 0) {

            nums1[k] = nums2[j];

            j--;
            k--;
        }
    }

    public static void main(String[] args) {

        AO7_Merge_two_sortedArray obj =
                new AO7_Merge_two_sortedArray();

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        obj.merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));
    }
}


// Method -2
/*
/*
========================================================
PROBLEM: Merge Sorted Array
========================================================

Given:
Two sorted arrays:

nums1 = first array
nums2 = second array

nums1 has enough extra space at the end
to hold all elements of nums2.

Task:
Merge nums2 into nums1
such that final array remains sorted.

--------------------------------------------------------
IMPORTANT
--------------------------------------------------------

You are NOT allowed to return another array.

Modify nums1 directly.

--------------------------------------------------------
EXAMPLE
--------------------------------------------------------

Input:
nums1 = [1,2,3,0,0,0]
m = 3

nums2 = [2,5,6]
n = 3

Output:
[1,2,2,3,5,6]

--------------------------------------------------------
EXPLANATION
--------------------------------------------------------

nums1 valid elements:
[1,2,3]

nums2:
[2,5,6]

After merge:
[1,2,2,3,5,6]

========================================================
APPROACH 1 : EXTRA ARRAY (BRUTE FORCE)
========================================================

IDEA:
1. Create new array
2. Merge both arrays like merge sort
3. Copy answer back to nums1

--------------------------------------------------------
TIME COMPLEXITY
--------------------------------------------------------

O(m + n)

--------------------------------------------------------
SPACE COMPLEXITY
--------------------------------------------------------

O(m + n)

========================================================


import java.util.*;

class MergeSortedArrayBruteForce {

    public void merge(int[] nums1, int m,
                      int[] nums2, int n) {

        // temporary array
        int[] temp = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        // merge both arrays
        while(i < m && j < n) {

            if(nums1[i] <= nums2[j]) {
                temp[k++] = nums1[i++];
            }
            else {
                temp[k++] = nums2[j++];
            }
        }

        // remaining elements from nums1
        while(i < m) {
            temp[k++] = nums1[i++];
        }

        // remaining elements from nums2
        while(j < n) {
            temp[k++] = nums2[j++];
        }

        // copy temp into nums1
        for(int x = 0; x < m + n; x++) {
            nums1[x] = temp[x];
        }
    }

    public static void main(String[] args) {

        MergeSortedArrayBruteForce obj =
                new MergeSortedArrayBruteForce();

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        obj.merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));
    }
}
*/