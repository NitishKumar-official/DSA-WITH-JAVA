
/*
PROBLEM:
Move all 0's to end while maintaining relative order
of non-zero elements.

Example:
Input  = [0,1,0,3,12]
Output = [1,3,12,0,0]
*/

class A05_MOVE_ZERO {
    public void moveZeroes(int[] nums) {

        int n = nums.length;

        // Pointer for placing non-zero elements
        int k = -1;

        // Step 1:
        // Move all non-zero elements to front
        for(int i = 0; i < n; i++) {

            if(nums[i] != 0) {

                k++;
                nums[k] = nums[i];
            }
        }

        // Step 2:
        // Fill remaining positions with 0
        for(int i = k + 1; i < n; i++) {

            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int nums[]={0,0,0,5,7,8,9};
        A05_MOVE_ZERO obj = new A05_MOVE_ZERO();
        obj.moveZeroes(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

    }
}