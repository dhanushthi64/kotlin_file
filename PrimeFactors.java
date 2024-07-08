import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        int n = 16;
        List<Integer> res = new ArrayList<>();
        while (n % 2 == 0) {
            res.add(2);
            n /= 2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while (n % i == 0) {
                if(i>=7) System.out.println(false);
                res.add(i);
                n /= i;
            }
        }
        if(n>2) res.add(n);
        for(int i=0;i<res.size();i++){
            i=++i;
            System.out.println(res.get(i));
        }
    }
}
