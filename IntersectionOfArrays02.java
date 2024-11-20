import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfArrays02 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        // HashMap to store frequency of elements in nums1
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // List to store the intersection elements
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            // Check if the current element exists in the map and has a non-zero count
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                // Decrement the count in the map
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert the result list to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result1 = intersect(nums1, nums2);
        System.out.print("Output: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 2
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] result2 = intersect(nums3, nums4);
        System.out.print("Output: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

