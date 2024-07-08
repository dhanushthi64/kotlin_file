import java.util.*;

public class ContinousSubarray {
    static boolean check(int[] nums,int k){
        Map<Integer, Integer> sumModMap = new HashMap<>();
        sumModMap.put(0, -1);
        int runningSum = 0;
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            
            if (k != 0) {
                runningSum %= k;
            }
            if (sumModMap.containsKey(runningSum)) {
                if (i - sumModMap.get(runningSum) > 1) {
                    return true;
                }
            } else {
                sumModMap.put(runningSum, i);
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {23,2,6,4,7};
        int k = 13;
        System.out.println(check(nums,k));
    }
}
