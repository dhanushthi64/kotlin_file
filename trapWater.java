

public class trapWater
{
	public static void main(String[] args) {
		int[] arr = new int[]{3, 0, 2, 0, 4};
		trapwater(arr);
		
	}
	public static void trapwater(int[] arr){
	    int n = arr.length;
	    int[] left = new int[n];
	    int[] right = new int[n];
	    int total=0;
	    if(n==0){
	        System.out.println(total);
	    }
	    left[0] = arr[0];
	    for(int i=1;i<n;i++){
	        left[i]=Math.max(left[i-1],arr[i]);
	    }
	    right[n-1] = arr[n-1];
	    for(int i=n-2;i>=0;i--){
	        right[i]=Math.max(right[i+1],arr[i]);
	    }
	    for(int i=0;i<n;i++){
	        total+=Math.min(left[i],right[i])-arr[i];
	    }
	    System.out.println(total);
	}
}
