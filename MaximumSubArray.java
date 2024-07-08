public class MaximumSubArray {
    static int maximum(int[] nums){
        if(nums==null || nums.length==0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int maxsum = nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            maxsum = Math.max(maxsum, dp[i]);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println(maximum(nums));
    }
}
