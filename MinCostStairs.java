public class MinCostStairs {
    static int climb(int[] arr,int n){
        int dp1=0, dp2=0;
        for(int i=0;i<n;i++){
            int dp0 = arr[i] + Math.min(dp1, dp2);
            dp2=dp1;
            dp1=dp0;
        }
        return Math.min(dp1, dp2);
    }
    public static void main(String[] args) {
        int[] arr = {10, 15, 20};
        int n = arr.length;
        System.out.println(climb(arr,n));
    }
}
