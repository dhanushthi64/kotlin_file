import java.util.*;
public class Nice {
    static void subarrays(int[] nums,int k){
        Map<Integer,Integer> m = new HashMap<>();
        for(int num:nums){
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        int count = 0;
        int sum = 0;
        for(Map.Entry<Integer,Integer> ele:m.entrySet()){
            System.out.println(ele.getKey()+" "+ele.getValue());
            if(ele.getKey()%2!=0){
                count = ele.getValue();
            }else{
                sum+=ele.getValue();
            }
        }
        if(count<k){
            System.out.println("Not Valid");
        }
        System.out.println(sum*2);
    }
    public static void main(String[] args) {
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k=2;
        subarrays(nums, k);
    }
}
