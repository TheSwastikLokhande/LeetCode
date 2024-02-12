import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _347_Top_K_Frequent_Elements {
    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,3,44,44,66};
        int s[]=topKFrequent(nums, 2);
        System.out.println("Output");
        for(int i: s){
            System.out.println(i);
        }
    }
     public static int[] topKFrequent(int[] nums, int k) {
        HashSet<Integer> result=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    cnt++;
                }
            }
            if(cnt>=k){
                result.add(nums[i]);
            }
        }
        
        
        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}
