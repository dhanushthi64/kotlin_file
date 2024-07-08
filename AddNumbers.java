import java.util.Arrays;

public class AddNumbers {
    static int SixIndex(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==6){
                return i;
            }
        }
        return 0;
    }
    static int SevenIndex(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==7){
                return i;
            }
        }
        return 0;
    }
    static void add(int[] arr,int sindex,int seindex){
        int sum = 0;
        for(int i=0;i<sindex;i++){
            sum+=arr[i];
        }
        for(int i=seindex+1;i<=arr.length-1;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr = {3,9,6,2,5,7,1  };
        int six = SixIndex(arr);
        int seven = SevenIndex(arr);
        add(arr, six, seven);
        String str = "Hello";
        int a = 'a';
        System.out.println(a);
    }
}