import java.util.*;


public class ChocoDistribution
{
	public static void main(String[] args) {
	    int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
        int result = chocodistribute(arr,m);
		if(result != -1){
		    System.out.println("Min-Difference: "+result);
		}
		else{
		    System.out.println("Invalid Input");
		}
	}
	public static int chocodistribute(int[] arr,int m){
	    int n= arr.length;
	    Arrays.sort(arr);
	    if(n==0 || m==0){
	        return 0;
	    }
	    if(n-1<m){
	        return -1;
	    }
	    int min = Integer.MAX_VALUE;
	    for(int i=0;i<n;i++){
	        int next = i+m-1;
	        if(next>=n){
	            break;
	        }
	        int diff = arr[next]-arr[i];
	        min = Math.min(min,diff);
	    }
	    return min;
	}
}
