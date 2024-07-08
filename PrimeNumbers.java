import java.util.HashMap;
import java.util.Map;

public class PrimeNumbers {
    static boolean prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static void primepos(int n){
        HashMap<Integer,Integer> m = new HashMap<>();
        int j=1;
        for(int i=10;i<100;i++){
            if(prime(i)){
                m.put(i, j++);
            }
        }
        if(m.containsKey(n)){
            System.out.println(m.get(n));
        }
        else{
            System.out.println("Enter prime number!!!");
        }
    }
    public static void main(String[] args) {
        int n = 79;
        primepos(n);
    }
}
