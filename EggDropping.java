public class EggDropping {
    static int drop(int n){
        int maxmove = 1000;
        int[][] dp = new int[3][maxmove+1];
        for(int m=0;m<maxmove;m++){
            dp[1][m] = m;
        }
        for(int m=1;m<=maxmove;m++){
            for(int k=2;k<=2;k++){
                dp[k][m] = 1+dp[k-1][m-1]+dp[k][m-1];
                if(dp[k][m]>=n){
                    return m;
                }
            }
        }
        return maxmove;
    }
    public static void main(String[] args) {
        int n = 100;
        int res = drop(n);
        System.out.println(res);
    }
}
