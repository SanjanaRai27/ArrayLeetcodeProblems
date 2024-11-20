// using HASH MAP
// itll will take extra space O(N)
import java.util.HashMap;

public class SingleNumber02 {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count the frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Find the number with a frequency of 1
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        
        // This line will never be reached as the input guarantees a single number
        return -1;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {2, 2, 1};
        System.out.println(singleNumber(nums1)); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums2)); // Output: 4

        int[] nums3 = {1};
        System.out.println(singleNumber(nums3)); // Output: 1
    }
}
