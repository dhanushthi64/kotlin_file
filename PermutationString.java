public class PermutationString {
    static void Permutations(String str,int l,int r){
        if(l==r){
            System.out.println(str);
            return;
        }
        else{
            for(int i=l;i<r;i++){
                str = swap(str,l,i);
                Permutations(str,l+1,r);
                str = swap(str,l,i);
            }
        }
    }
    static String swap(String str,int i,int j){
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void main(String[] args) {
        String input = "ABCD";
        int l = 0;
        int r = input.length();
        Permutations(input,l,r);
    }
}
