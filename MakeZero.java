import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MakeZero {
    static void minimum(int[] nums){
        HashSet<Integer> uniquePositives = new HashSet<>();
        for(int num:nums){
            if(num>0){
                uniquePositives.add(num);
            }
        }
        System.out.println(uniquePositives.size()); 
    }
    public static void main(String[] args) {
        int[] nums = {1,5,0,3,5};
        minimum(nums);
    }
}