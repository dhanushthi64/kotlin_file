import java.util.ArrayList;

public class FloorInSortedArray {
    public static void main(String args[]){
        int arr[] = {1,2,8,10,11,12,19};
        int maxele = 0;
        int x = 5;
        ArrayList<Integer> max = new ArrayList();
        int n = arr.length;
        int pos = -1;
        for(int i=0;i<n-1;i++){
            if(arr[i]<x){
                max.add(arr[i]);
            }
        }
        if(max.size()==0){
            System.out.println(pos);
        }
        else{
            maxele = max.get(0);
            for(int i=0;i<max.size();i++){
                if(maxele < max.get(i)){
                    maxele = max.get(i);
                    pos = i;
                }
            }
            System.out.println(pos);
        }
        
    }
}
