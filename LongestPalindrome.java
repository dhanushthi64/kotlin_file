import java.util.HashMap;

public class LongestPalindrome {
    static int longest(String s){
        HashMap<Character,Integer> freqmap = new HashMap<>();
        for(char c:s.toCharArray()){
            freqmap.put(c, freqmap.getOrDefault(c, 0)+1);
        }
        int length = 0;
        boolean hasOdd = false;
        for(int value:freqmap.values()){
            if(value%2==0) length+=value;
            if(value%2!=0){
                length+=value-1;
                hasOdd = true;
            }
        }
        return hasOdd ? length+1 : length;
    }
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longest(s));
    }
}
