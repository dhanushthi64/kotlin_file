public class HouseRobberTwo {
    static int robtwo(int[] nums){
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[1];
        int maxrob1 = robhelper(nums, 0, nums.length-2);
        int maxrob2 = robhelper(nums, 1, nums.length-1);
        System.out.println(maxrob1);
        System.out.println(maxrob2);
        return Math.max(maxrob1,maxrob2);
    }
    static int robhelper(int[] nums,int start,int end){
        int current = 0;
        int prevone = 0;
        int prevtwo = 0;
        for(int i=start;i<end;i++){
            current = Math.max(prevone,prevtwo+nums[i]);
            prevtwo = prevone;
            prevone = current;
        }
        return current;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,2};
        int n = arr.length;
        int res = robtwo(arr);
        System.out.println(res);
    }
}
