// PLUS ONE
// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

 

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Input: digits = [9, 9, 9]

// Start with the least significant digit 9. Add 1 to it, making it 10. Set it to 0 and carry over the 1.
// Next, the second digit is 9. Add 1 to it, making it 10. Set it to 0 and carry over the 1.
// Finally, the third digit is 9. Add 1 to it, making it 10. Set it to 0 and carry over the 1.
// Since there are no more digits, insert 1 at the front.
// Output: [1, 0, 0, 0]

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        // Traverse the array from right to left
        for (int i = digits.length - 1; i >= 0; i--) {
            // Add 1 to the current digit
            if (digits[i] < 9) {
                digits[i]++; // No carry, just return the array
                return digits;
            }
            digits[i] = 0; // Set current digit to 0 and carry 1
        }
        
        // If we reach here, it means we need to add a new digit at the beginning
        int[] result = new int[digits.length + 1];
        result[0] = 1; // Set the first digit to 1
        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne(digits1);
        System.out.print("Output: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 2
        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = plusOne(digits2);
        System.out.print("Output: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
