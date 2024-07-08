import java.util.*;

public class ContainDuplicate {
    static boolean duplicate(int[] nums){
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!m.containsKey(nums[i])){
                m.put(nums[i], 1);
            }
            else{
                m.put(nums[i],m.get(nums[i])+1);
            }
        }
        for(int ele:m.keySet()){
            if(m.get(ele)>=2){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3};
        boolean res = duplicate(nums);
        System.out.println(res);
    }
}
