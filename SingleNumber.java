public class SingleNumber {
    static void single(int[] nums){
        int res=1;
        for(int num:nums){
            res ^= num;
            System.out.println(res);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,1,1};
        single(nums);
    }
}
