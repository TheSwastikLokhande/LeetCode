import java.util.Arrays;
import java.util.Collections;

public class _2971_Find_Polygon_With_the_Largest_Perimeter {
    public static void main(String[] args) {
        int[] nums1 = {5, 5, 5};
        int[] nums2 = {1, 12, 1, 2, 5, 50, 3};
        int[] nums3 = {5, 5, 50};

        System.out.println(largestPerimeter(nums1)); // Output: 15
        System.out.println(largestPerimeter(nums2)); // Output: 12
        System.out.println(largestPerimeter(nums3)); 
    }
    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
        // Iterate in reverse to get the largest elements    first
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                // The current three consecutive elements can form a valid polygon
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }

        // No valid polygon found
        return -1;
    }
}
