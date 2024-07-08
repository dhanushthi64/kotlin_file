import java.util.Stack;

public class RemoveOuterParanthesis {
    static void remove(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                st.pop();
            }
            if(st.isEmpty()){
                sb.append(s.substring(start+1, i));
                start = i+1;
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String s = "()()";
        remove(s);
    }
}
