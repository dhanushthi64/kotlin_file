import java.util.*;

public class MergeIntervals
{
    public static class Interval{
        int start,end;
        Interval(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
	public static void main(String[] args) {
	    Interval arr[] = new Interval[4];
	    arr[0]=new Interval(6,8);
        arr[1]=new Interval(1,9);
        arr[2]=new Interval(2,4);
        arr[3]=new Interval(4,7);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].start+" "+arr[i].end);
        }
        mergeIntervals(arr);
	}
	public static void mergeIntervals(Interval arr[]){
	    if(arr.length<=0) return;
	    Stack<Interval> stack = new Stack<>();
	    Comparator<Interval> sample = new Comparator<Interval>(){
	        @Override
	        public int compare(Interval i1,Interval i2){
	            return i1.start-i2.start;
	        }
	    };
	    Arrays.sort(arr,sample);
	    System.out.println("After sorted:");
	    for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].start+" "+arr[i].end);
        }
        stack.push(arr[0]);
	    for(int i=1;i<arr.length;i++){
	        Interval top = stack.peek();
	        if(top.end<arr[i].start){
	            stack.push(arr[i]);
	        }
	        if(top.end<arr[i].end){
	            top.end = arr[i].end;
	            stack.pop();
	            stack.push(top);
	        }
	    }
	    System.out.println("The merged intervals are: ");
	    while(!stack.isEmpty()){
	        Interval t = stack.pop();
	        System.out.println(t.start+" "+t.end);
	    }
	}
}
