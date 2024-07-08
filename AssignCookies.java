import java.util.HashSet;

public class AssignCookies {
    static void assign(int[] g,int[] s){
        HashSet<Integer> se = new HashSet<>();
        for(int i=0;i<s.length;i++){
            se.add(s[i]);
        }
        for(int ele:se){
            System.out.println(ele);
        }
        int count = 0;
        int gindx=0;
        int n = g.length;
        while(gindx<n){
            for(int ele:se){
                if(ele>=g[gindx]){
                    count++;
                }
            }
            gindx++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        assign(g,s);
    }
}
