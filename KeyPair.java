import java.util.Arrays;
import java.util.HashSet;

public class KeyPair {
    static void keypair(int[] arr,int x){
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int temp = x-arr[i];
            if(s.contains(temp)){
                System.out.println("Yes");
                return;
            }
            s.add(arr[i]);
        }
        System.out.println("No");
    }
    static boolean binarysearch(int[] arr,int low,int high,int search){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==search){
                return true;
            }
            else if(arr[mid]>search){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
    static void checktwosum(int[] arr,int sum){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int searchkey = sum-arr[i];
            if(binarysearch(arr, i+1, n-1, searchkey)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int x = 16;
        checktwosum(arr, x);;
    }
}
