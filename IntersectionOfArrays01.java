// INTERSECTION OF TWO ARRAYS
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.

// ''''
// USING POINTERS
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArrays01 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Initialize pointers and result list
        int i = 0, j = 0;
        List<Integer> resultList = new ArrayList<>();

        // Use two pointers to find the intersection
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // Add to the result and move both pointers
                resultList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                // Move pointer of the smaller element
                i++;
            } else {
                j++;
            }
        }

        // Convert the result list to an array
        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
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

    }
}