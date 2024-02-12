public class TwoSum {
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int result[] = twoSum(nums, 18);
        for (int num : result) {
            System.out.print(num + " ");
        }
    
    }
    public static int[] twoSum(int nums[],int target){
        
        for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]+nums[j-1]==target){
                    return new int[] {j,j-i};
                }
            }
        }
        return null;

    }
}
