//368. Largest Divisible Subset




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class _368_Largest_Divisible_Subset {
    public static void main(String[] args) {
        int[] nums = {3, 4, 16, 8};
        System.out.println(largestDivisibleSubset(nums));
    }

    static List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);  // Sort the array to simplify the subset checking
        int n = nums.length;

        int[] dp = new int[n];  // Dynamic programming array to store the length of the largest subset ending at each index
        Arrays.fill(dp, 1);     // Initialize all values to 1 (minimum length of a subset is 1)

        int maxSize = 1;  // Variable to store the size of the largest subset
        int lastIndex = 0;  // Variable to store the index of the last element in the largest subset

        // Dynamic programming to find the length of the largest subset
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    if (dp[i] > maxSize) {
                        maxSize = dp[i];
                        lastIndex = i;
                    }
                }
            }
        }

        // Reconstruct the largest subset using the information stored in the dp array
        List<Integer> result = new ArrayList<>();
        int currentSize = maxSize;
        int currentVal = nums[lastIndex];

        for (int i = lastIndex; i >= 0; i--) {
            if (currentSize > 0 && currentVal % nums[i] == 0 && dp[i] == currentSize) {
                result.add(nums[i]);
                currentVal = nums[i];
                currentSize--;
            }
        }

        return result;
    }
}
