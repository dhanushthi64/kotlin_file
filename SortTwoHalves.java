public class SortTwoHalves {
    static void merge(int[] arr){
        int half_i = 0;
        int n = arr.length;
        int[] temp = new int[n];
        for(int g=0;g<n-1;g++){
            if(arr[g]>arr[g+1]){
                half_i = g+1;
            }
        }
        if(half_i == 0){
            return;
        }
        int i=0;
        int j=half_i;
        int k=0;
        while(i<half_i && j<n){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i<half_i){
            temp[k++] = arr[i++];
        }
        while(j<n){
            temp[k++] = arr[j++];
        }
        for(int e=0;e<n;e++){
            arr[e]=temp[e];
        }
    }
    public static void main(String args[]){
        int arr[] = {2,3,8,-1,7,10};
        merge(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
