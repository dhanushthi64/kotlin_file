import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    static void countarr(int[] arr,int p){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=1;i<=p;i++){
                freq.put(i, 0);
        }
        for(int i=0;i<arr.length;i++){
            for(int key:freq.keySet()){
                if(arr[i]==key){
                    freq.put(arr[i], freq.get(arr[i])+1);
                }
            }
        }
        for(Map.Entry<Integer,Integer> ele:freq.entrySet()){
            System.out.println(ele.getKey()+" "+ele.getValue());
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = freq.get(i+1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        int p = 5;
        countarr(arr,p);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }   
}
