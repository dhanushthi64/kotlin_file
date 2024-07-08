public class LengthOfLastWord {
    static void last(String s){
        String[] words = s.split(" ");
        System.out.println(words[words.length-1].length());
    }
    public static void main(String[] args) {
        String s = "Hello World";
        last(s);
    }   
}
