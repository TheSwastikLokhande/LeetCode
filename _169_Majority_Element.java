public class _169_Majority_Element {

    public static void main(String[] args) {
    int a[]={2,2,1,1,1,2,2};
    System.out.println(majorityElement(a));
    }
    public static int majorityElement(int[] nums) {
        int m=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(c==0){
                m=nums[i];
                c=1;
            }else if(nums[i]==m){
                c++;
            }else{
                c--;
            }

        }
        return m;
    }
}