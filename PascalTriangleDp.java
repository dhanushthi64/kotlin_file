import java.util.*;

public class PascalTriangleDp {
    static List<Integer> pascal(int rowIndex){
        List<Integer> result = new ArrayList<>();
        int[][] dp = new int[rowIndex+1][rowIndex+1];
        for(int i=0;i<=rowIndex;i++){
            dp[i][0] = 1;
            dp[i][i] = 1;
        }
        for(int i=2;i<=rowIndex;i++){
            for(int j=0;j<=i;j++){
                if(dp[i][j]==0){
                    dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
                }
            }
        }
            for(int j=0;j<=rowIndex;j++){
                result.add(dp[rowIndex][j]);
            }
            return result;
    }
    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(pascal(rowIndex));
    }
}
