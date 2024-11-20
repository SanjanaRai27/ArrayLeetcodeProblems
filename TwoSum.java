// TWO SUM
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]


import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the index of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // Find the complement
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If yes, return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        // Return an empty array if no solution (though the problem guarantees there is one)
        return new int[] {};
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.print("Output: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.print("Output: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.print("Output: ");
        for (int num : result3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

