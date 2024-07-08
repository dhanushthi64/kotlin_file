import java.util.Arrays;

public class HandOfStraights {
    static boolean handgroup(int[] hand,int groupSize){
        if(hand.length%groupSize!=0) return false;
        Arrays.sort(hand); 
       int n = hand.length;
       int[] count = new int[n];
       Arrays.fill(count, 1);
       for(int i=0;i<hand.length;i++){
           if(count[i]==0) continue;
            int currgrpsize = 1;
            for(int j=i+1;j<hand.length && currgrpsize<groupSize;j++){
                if(count[j]==0) continue;
                if(hand[j]==hand[i]+currgrpsize){
                    currgrpsize++;
                    count[j]--;
                }
            }
            if(currgrpsize!=groupSize){
                return false;
            }
       }
       return true;
    }
    public static void main(String[] args) {
        int[]  hand= {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;
        boolean res = handgroup(hand,groupSize);
        System.out.println(res);
    }
}
