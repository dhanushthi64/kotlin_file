import java.util.*;
import java.io.*;
public class CommonCharacters {
    static List<String> common(String[] words){
        List<String> result = new ArrayList<>();
        if(words==null || words.length==0){
            return result;
        }
        int[] minfreq = new int[26];
        Arrays.fill(minfreq,Integer.MAX_VALUE);
        for(String word:words){
            int[] charcount = new int[26];
            for(char c:word.toCharArray()){
                charcount[c-'a']++;
            }
            for(int i=0;i<26;i++){
                minfreq[i] = Math.min(minfreq[i], charcount[i]);
            }
        }
        for(int i=0;i<26;i++){
            while(minfreq[i]>0){
                result.add(String.valueOf((char)(i+'a')));
                minfreq[i]--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        List<String> res = common(words);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
