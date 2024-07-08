public class facingsun {
    static int count(int[] arr){
        int count = 1;
        int currmax = arr[0];
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>currmax){
                currmax=arr[i];
                count+=1;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {2,3,4,5};
        int res=count(arr);
        System.out.println(res);
    }
}
