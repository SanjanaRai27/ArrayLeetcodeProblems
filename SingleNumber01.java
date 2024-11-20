// single num
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// Input: nums = [2,2,1]
// Output: 1


// USING XOR:

// 𝑎
// ⊕
// 𝑎
// =
// 0
// a⊕a=0 (any number XORed with itself is 0).
// 𝑎
// ⊕
// 0
// =
// 𝑎
// a⊕0=a (any number XORed with 0 remains unchanged).
// XOR is commutative and associative, meaning the order of operations does not matter

public class SingleNumber01 {
    public static int singleNumber(int[] nums) {
        int result = 0;
        
        // XOR all elements in the array
        for (int num : nums) {
            result ^= num;
        }
        
        // The result will hold the single number
        return result;
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

