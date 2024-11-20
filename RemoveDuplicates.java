// remove duplicate elements in an arr

// Remove Duplicates from Sorted Array

// Solution
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.


public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // Edge case: empty array
        }
        
        // Pointer for the position of unique elements
        int uniqueIndex = 0;
        
        // Iterate through the array
        for (int i = 1; i < nums.length; i++) {
            // Check if the current element is different from the last unique element
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++; // Move the unique index forward
                nums[uniqueIndex] = nums[i]; // Update the array with the new unique element
            }
        }
        
        // The number of unique elements is uniqueIndex + 1
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 4};
        int k = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        
        // Print the modified array with unique elements
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}


