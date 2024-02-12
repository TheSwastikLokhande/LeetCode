import java.util.ArrayList;
import java.util.List;

public class _238_Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int nums []= {1,2,3,4};
        int r[]=productExceptSelf(nums);
        for(int i: r){
            System.out.println(i);
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        List <Integer>result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                product*=nums[j];
            }
            result.add(product);
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
