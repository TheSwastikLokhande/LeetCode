import java.lang.reflect.Array;
import java.util.ArrayList;

public class _2149_Rearrange_Array_Elements_by_Sign {
    public static void main(String[] args) {
        int nums[]={3,1,-2,-5,2,-4};

        rearrangeArray(nums);

        for(int i:nums){
            System.out.println(i+" ");
        }
    }
    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> n=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                n.add(nums[i]);
            }else{
                p.add(nums[i]);
            }
        }
        int index = 0;
        for (int i = 0; i < Math.min(p.size(), n.size()); i++) {
            nums[index++] = p.get(i);
            nums[index++] = n.get(i);
        }
    

        return nums;
    }
}
