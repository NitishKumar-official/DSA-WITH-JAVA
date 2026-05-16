
/*
PROBLEM:
Remove duplicates from sorted array in-place.
Return the number of unique elements.

Example:
Input  = [1,1,2]
Output = 2
Array  = [1,2,_]

ISSUE IN YOUR CODE:
You are returning k, but k is the INDEX of last unique element.
Length should be k + 1.

Also handle edge case when array is empty.
*/

class A04_RemoveDuplicate {
    public int removeDuplicates(int[] nums) {

        // Edge case
        if(nums.length == 0){
            return 0;
        }

        int n = nums.length;

        int k = 0;

        // First element is always unique
        nums[k] = nums[0];

        for(int i = 1; i < n; i++){

            // New unique element found
            if(nums[i] != nums[i - 1]){

                k++;
                nums[k] = nums[i];
            }
        }

        // k is index, so length = k + 1
        return k + 1;
    }

    public static void main(String []args){
        int arr[]={0,1,1,2,2};
        A04_RemoveDuplicate obj = new A04_RemoveDuplicate();
        System.out.println(obj.removeDuplicates(arr));
    }
}