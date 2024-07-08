import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountDisEleInRowMatrix {
    static void distinct(int[][] M,int Row,int Col){
        HashSet<Integer> us = new HashSet<>();
        for(int i=0;i<Col;i++){
            us.add(M[0][i]);
        }
        for(int i=1;i<Row;i++){
            HashSet<Integer> temp = new HashSet<>();
            for(int j=0;j<Col;j++){
                temp.add(M[i][j]);
            }
        HashSet<Integer> itr1 = (HashSet<Integer>) us.clone();
        for(int x:itr1){
            if(!temp.contains(x)){
                us.remove(x);
            }
            if(us.size()==0){
                break;
            }
        }
        }
        
        HashSet<Integer> itr2 = (HashSet<Integer>) us.clone();
    
        for(int x:itr2){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int[][] M = {{12, 1, 14, 3, 16},
        {14, 2, 1, 3, 35},
        {14, 1, 14, 3, 11},
        {14, 5, 3, 2, 1},
        {1, 18, 3, 21, 14}};
        int Row = M.length;
        int Col = M[0].length;
        distinct(M,Row,Col);
    }
}
