public class ValidPalindrome {
    static boolean isPalindrome(String s){
        StringBuilder cleaned = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                cleaned.append(c);
            }
        }
        if(cleaned.toString().toLowerCase().equals(cleaned.reverse().toString().toLowerCase())){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "0p";
        System.out.println(isPalindrome(s));
    }
}
