// contaions duplicate in an array TRUE OR FLASE
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        // Use a HashSet to store unique elements
        HashSet<Integer> seen = new HashSet<>();
        
        // Traverse the array
        for (int num : nums) {
            // If the number is already in the set, return true
            if (seen.contains(num)) {
                return true;
            }
            // Otherwise, add the number to the set
            seen.add(num);
        }
        
        // If no duplicates are found, return false
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums1)); // Output: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2)); // Output: false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums3)); // Output: true
    }
}
