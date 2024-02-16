import java.util.HashSet;
import java.util.Iterator;

public class _1481_Least_Number_of_Unique_Integers_after_K_Removals {
    public static void main(String[] args) {
        int []  arr = {4,3,1,1,3,3,2};
      System.out.println(findLeastNumOfUniqueInts(arr, 3));  
    }
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashSet<Integer> re=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            re.add(arr[i]);
        }
        System.out.println(re);
        int j=0;
        Iterator<Integer> iterator = re.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();  
            j++;
            if(j==k){
                break;
            }          
        }

        return re.size();
    }
}
