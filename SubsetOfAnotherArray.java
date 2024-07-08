import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SubsetOfAnotherArray {
    static boolean subset(int[] a1,int[] a2){
        int j=0;
        for(int i=0;i<a2.length;i++){
            for( j=0;j<a1.length;j++){
                if(a2[i]==a1[j]){
                    break;
                }
            }
            if(j==a1.length){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a1 = {10, 5, 2, 23, 19};
        int[] a2 = {11, 3, 7, 1, 7};
        boolean res = subset(a1,a2);
        if(res==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
