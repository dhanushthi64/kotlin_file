import java.util.Arrays;

public class MissingNumber {
    static void missing(int[] nums){
        int res = 0;
        Arrays.sort(nums);
        flag=0;
        for(int i=0;i<nums.length;i++){
            // res ^= nums[i];
            // if(res!=i){
            //     System.out.println(i);
            // }
            if(i!=nums[i])
                 System.out.println(i);
                 flag=1;
              
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        missing(nums);
    }
}
