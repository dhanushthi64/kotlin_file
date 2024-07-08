public class ReverseStringChar {
    static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        String[] words = input.split("\\."); 
        for(int i=0,j=words.length-1;i<j;i++,j--){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        } 
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
            if(i<words.length-1){
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "i.like.this.program.very.much";
        String res = reverseString(input);
        System.out.println(res);
    }
}