public class TownJudge {
    static int town(int n,int[][] trust){
        if(trust.length<n-1){
            return -1;
        }
        int[] indegrees = new int[n+1];
        int[] outdegrees = new int[n+1];
        for(int[] relation:trust){
            int a = relation[0];
            int b = relation[1];
            outdegrees[a]++;
            indegrees[b]++;
        }
        for(int i=1;i<=n;i++){
            if(indegrees[i]==n-1 && outdegrees[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] trust1 = {{1, 2}};
        System.out.println(town(2, trust1));
    }
}
