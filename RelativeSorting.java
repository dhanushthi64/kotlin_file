import java.util.ArrayList;
import java.util.Collections;

public class RelativeSorting {
    static void sortA1ByA2(int[] A1,int[] A2){
        int[] out = new int[A1.length];
        int tg=0;
        int idx = 0;
        for(int i=0;i<A2.length;i++){
            tg = A2[i];
            for(int j=0;j<A1.length;j++){
                if(tg==A1[j]){
                    out[idx++] = A1[j];
                }
            }
        }
        int gh = 0;
        ArrayList<Integer> gm = new ArrayList<>();
        for(int i=0;i<A1.length;i++){
            tg=A1[i];
            for(int j=0;j<A2.length;j++){
                if(tg==A2[j]){
                    gh=1;
                    break;
                }
            }
            if(gh==0){
                gm.add(A1[i]);
            }
            gh=0;
        }
        Collections.sort(gm);
        for(int i=0;i<gm.size();i++){
            out[idx++] = gm.get(i);
        }
        for(int i=0;i<A1.length;i++){
            System.out.print(out[i]);
        }
    }
    public static void main(String[] args) {
        int[] A1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] A2 = {2, 1, 8, 3};
        sortA1ByA2(A1,A2);
    }
}
