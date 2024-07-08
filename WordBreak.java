import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    static int breaks(int n,String s,Set<String> dict){
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && dict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()] ? 1 : 0;
    }
    public static void main(String[] args) {
        int n = 6;
        String s = "ilike";
        Set<String> dict = new HashSet<>();
        dict.add("i");
        dict.add("like");
        dict.add("sam");
        dict.add("sung");
        dict.add("samsung");
        dict.add("mobile");
        int res = breaks(n,s,dict);
        System.out.println(res);
    }
}
