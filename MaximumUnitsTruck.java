import java.util.*;

public class MaximumUnitsTruck {
    static void maximumUnits(int[][] boxTypes,int truckSize){
        Arrays.sort(boxTypes,new Comparator<int[]>() {
            @Override
            public int compare(int[] a,int[] b){
                return b[1]-a[1];
            }
        });
        int maxunits = 0;
        for(int[] boxType:boxTypes){
            int noofboxes = boxType[0];
            int units = boxType[1];
            if(noofboxes<=truckSize){
                maxunits+=noofboxes*units;
                truckSize-=noofboxes;
            }
            else{
                maxunits+=truckSize*units;
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize = 10;
        maximumUnits(boxTypes,truckSize);
    }
}
