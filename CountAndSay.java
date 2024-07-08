import java.util.*;

public class CountAndSay {
    static void countandsay(int n){
        StringBuilder s = new StringBuilder();
        s.append("1");
        for(int i=2;i<=n;i++){
            Map<Integer,Integer> m = new HashMap<>();
            
            for(char c:s.toString().toCharArray()){
                m.put(Character.getNumericValue(c), m.getOrDefault(Character.getNumericValue(c), 0)+1);
                s.setLength(0);
            }
            for(Map.Entry<Integer,Integer> ele:m.entrySet()){
                s.append(String.valueOf(ele.getValue())+String.valueOf(ele.getKey()));
                System.out.println(ele.getKey()+" "+ele.getValue());
            }
            System.out.println(s.toString());
        
        }
        System.out.println(s.toString());
    }
    public static void main(String[] args) {
        int n = 4;
        countandsay(n);
    }
    
}