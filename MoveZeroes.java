// MOPVE ZEROES
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]



public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        // Pointer to track where the next non-zero element should be placed
        int insertPos = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, move it to the insertPos position
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                // Only increment insertPos if we've moved a non-zero element
                if (i != insertPos) {
                    nums[i] = 0;
                }
                insertPos++;
            }
        }
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.print("Output: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 2
        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.print("Output: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

