public class DiceThrow {
    static int dicethrew(int n,int m,int x){
       int[][] dp = new int[n+1][x+1];
       dp[0][0] = 1;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=x;j++){
            dp[i][j]=0;
            for(int k=1;k<=m;k++){
                if(j-k>=0){
                    dp[i][j]+=dp[i-1][j-k];
                }
            }
        }
       }
       return dp[n][x];
    }
    public static void main(String[] args) {
        int n=3;
        int m=6;
        int x=12;
        int res = dicethrew(n,m,x);
        System.out.println(res);
    }
}
