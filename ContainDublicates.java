import java.util.HashSet;

public class ContainDublicates {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int num[]={1,1,2,3,4};
       System.out.println(containDublicates(num)+"");
    }
    private static boolean containDublicates(int[] num) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:num){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
    
}