public class MaxSumConfig {
    static long max_sum(int[] a,int n){
        long sum = 0;
        long rotatedSum = 0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            rotatedSum+=i*a[i];
        }
        long maxSum = rotatedSum;
        for(int i=1;i<n;i++){
            rotatedSum = rotatedSum+sum-n*a[n-i];
            maxSum = Math.max(maxSum, rotatedSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] a = {1,7,2};
        int n = a.length;
        System.out.println(max_sum(a,n));
    }
}
