// Intuition
// Since the array is already sorted, we can use two pointers at opposite ends to efficiently find the target sum by shrinking the window.

//Approach

// Place a left pointer at the beginning and a right pointer at the end of the array.
// Calculate the sum of the elements at both pointers.
// If the sum equals the target, return their 1-based indices.
// If the sum is less than the target, increment the left pointer to increase the sum.
// If the sum is greater than the target, decrement the right pointer to decrease the sum.

//Time Complexity: O(N) — The array is traversed at most once using the two pointers.
//Space Complexity: O(1) — Only a few variables are used; no extra memory is required.

import java.util.Arrays;

public class Two_SUM_II {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[] { i + 1, j + 1 };
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] {};
    }
// Main method added so you can run and test the code in VS Code
    public static void main(String[] args) {
        Two_SUM_II solution = new Two_SUM_II();
        
        // Example test case (Array must be sorted for Two Sum II)
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twoSum(numbers, target);
        System.out.println("Result: " + Arrays.toString(result)); 
        // Expected output: Result: [1, 2]
    }
}
