public class EditDistance {
    static int distance(String word1,String word2){
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0] = i;
        }
        for(int j=0;j<=n;j++){
            dp[0][j] = j;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    int del = dp[i-1][j]+1;
                    int ins = dp[i][j-1]+1;
                    int rep = dp[i-1][j-1]+1;
                    dp[i][j] = Math.min(ins,Math.min(del,rep));
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        int res = distance(word1,word2);
        System.out.println(res);
    }
}
