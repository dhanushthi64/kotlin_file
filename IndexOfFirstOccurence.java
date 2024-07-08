public class IndexOfFirstOccurence {
    static int Occurence(String haystack,String needle){
       if(needle.isEmpty()){
            return -1;
       }
       for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                return i+1;
            }
       }
       return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sa";
        System.out.println(Occurence(haystack,needle));
    }
}
