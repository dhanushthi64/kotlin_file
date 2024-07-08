import java.util.Arrays;

public class ArrayPartition {
    static int partition(int[] nums){
        int maxsum = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            maxsum+=nums[i];
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(partition(nums));
    }
}
