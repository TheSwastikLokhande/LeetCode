public class _42_Trapping_Rain_Water {
    public static void main(String[] args) {
       int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
       System.out.println(trap(height));
    }
    public static int trap(int[] height) {
        int n = height.length;
        if(n<=2){
            return 0;
        }
        int left=0;
        int right=n-1;
        int leftMax=0;
        int rightMax=0;
        int result =0;

        while(left < right){
            leftMax=Math.max(leftMax,height[left]);
            rightMax=Math.max(rightMax, height[right]);

            if(height[left]<height[right]){
                result +=leftMax-height[left];
                left++;
            }
            else{
                result +=rightMax - height[right];
                right--;
            }
        }

        return result;
  }
}
