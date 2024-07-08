public class ContainDuplicateTwo {
    static boolean dupli(int[] nums,int k){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]==nums[j] && Math.abs(i-j)<k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        boolean res = dupli(nums,k);
        System.out.println(res);
    }
}
