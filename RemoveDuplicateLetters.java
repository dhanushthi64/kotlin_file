import java.util.*;

public class RemoveDuplicateLetters {
    static void remove(String s){
        Map<Character,Integer> m = new HashMap<>();
        Stack<Character> st = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0)+1);
            st.add(s.charAt(i));
        }
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            char c = st.pop();
            if(m.get(c)>1){
                m.put(c,m.get(c)-1);
            }
            else{
                res.append(c);
            }
        }
        for(Map.Entry<Character,Integer> ele:m.entrySet()){
            System.out.println(ele.getKey()+" "+ele.getValue());
        }
        char[] temp = res.toString().toCharArray();
        Arrays.sort(temp);
        System.out.println();
    }
    public static void main(String[] args) {
        String s = "bcabc";
        remove(s);
        System.out.println('a'>'b');
    }
}
