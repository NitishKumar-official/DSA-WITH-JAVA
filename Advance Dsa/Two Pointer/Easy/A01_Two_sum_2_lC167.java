/*
========================================================
PROBLEM: Two Sum II - Input Array Is Sorted
========================================================

Given:
- A sorted integer array
- A target value

Find:
Two numbers whose sum equals target.

Return:
Indices in 1-based indexing.

--------------------------------------------------------
EXAMPLE
--------------------------------------------------------

Input:
numbers = [2,7,11,15]
target = 9

Output:
[1,2]

========================================================
APPROACH 2 : TWO POINTER (OPTIMAL)
========================================================

IMPORTANT OBSERVATION:
Array is already SORTED.

So:
- Smallest value at left side
- Largest value at right side

Use:
left pointer  -> start
right pointer -> end

--------------------------------------------------------
LOGIC
--------------------------------------------------------

1. Calculate sum

2. If sum == target
      answer found

3. If sum < target
      move left++
      because bigger sum needed

4. If sum > target
      move right--
      because smaller sum needed

--------------------------------------------------------
TIME COMPLEXITY  : O(n)
SPACE COMPLEXITY : O(1)

BEST APPROACH

========================================================
*/

import java.util.*;

class A01_Two_sum_2_lC167{

    public int[] twoSum(int[] numbers, int target) {

        // left pointer
        int left = 0;

        // right pointer
        int right = numbers.length - 1;

        // loop until pointers meet
        while(left < right) {

            // current sum
            int sum = numbers[left] + numbers[right];

            // if target found
            if(sum == target) {

                // return 1-based indexing
                return new int[] {
                    left + 1,
                    right + 1
                };
            }

            // need bigger sum
            else if(sum < target) {
                left++;
            }

            // need smaller sum
            else {
                right--;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        A01_Two_sum_2_lC167 obj = new A01_Two_sum_2_lC167();

        int[] numbers = {2,7,11,15};
        int target = 9;

        int[] ans = obj.twoSum(numbers, target);

        System.out.println(Arrays.toString(ans));
    }
}

/*
========================================================
PROBLEM: Two Sum II - Input Array Is Sorted
========================================================

Given:
- A 1-indexed sorted integer array 'numbers'
- A target value

Find:
Two numbers such that:

numbers[i] + numbers[j] = target

Return:
Indices in 1-based indexing.

--------------------------------------------------------
EXAMPLE
--------------------------------------------------------

Input:
numbers = [2,7,11,15]
target = 9

Output:
[1,2]

Explanation:
2 + 7 = 9

========================================================
APPROACH 1 : HASHMAP APPROACH
========================================================

IDEA:
- Traverse the array
- Find complement = target - current element
- If complement already exists in HashMap:
      answer found
- Else store current element in map

--------------------------------------------------------
WHY IT WORKS?
--------------------------------------------------------

Example:

numbers = [2,7,11,15]
target = 9

Step 1:
current = 2
complement = 7

Store:
2 -> index 0

Step 2:
current = 7
complement = 2

2 already exists in map
Answer found

--------------------------------------------------------
TIME COMPLEXITY  : O(n)
SPACE COMPLEXITY : O(n)

NOTE:
This approach works for:
- sorted arrays
- unsorted arrays

========================================================


import java.util.*;

class HashMapApproach {

    public int[] twoSum(int[] numbers, int target) {

        // key   -> number
        // value -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        // traverse array
        for(int i = 0; i < numbers.length; i++) {

            // required number
            int complement = target - numbers[i];

            // check if complement already exists
            if(map.containsKey(complement)) {

                // return 1-based indexing
                return new int[] {
                    map.get(complement) + 1,
                    i + 1
                };
            }

            // store current element and index
            map.put(numbers[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        HashMapApproach obj = new HashMapApproach();

        int[] numbers = {2,7,11,15};
        int target = 9;

        int[] ans = obj.twoSum(numbers, target);

        System.out.println(Arrays.toString(ans));
    }
}

*/