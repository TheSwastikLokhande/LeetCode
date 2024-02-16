public class _11_Container_With_Most_Water {
    public static void main(String[] args) {
        int nums[]={1,8,6,2,5,4,8,3,7};
    }
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            
            maxArea = Math.max(maxArea, area);

            // Move the pointers towards each other
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
