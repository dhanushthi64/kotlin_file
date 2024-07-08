import java.util.*;
import java.io.*;

public class MagneticForce {
    static void maxDistance(int[] position,int m){
        Arrays.sort(position);
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<position.length/2;i++){
            int temp = position[i];
            position[i] = position[position.length-i-1];
            position[position.length-i-1] = temp;
        }
        for(int i=0;i<m;i++){
            if(i==m-1){
                res.add(position[position.length-1]);
                break;
            }
            res.add(position[i]);
        }
    }
        public static void main(String[] args) {
        int[] position = {1,2,3,4,7};
        int m = 3;
        maxDistance(position,m);
    }
}
