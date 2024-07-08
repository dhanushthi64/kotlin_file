import java.util.*;

public class ReplaceWords {
    static String replace(List<String> dictionary, String sentence) {
        Set<String> dictSet = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String prefix = "";
            for (int i = 1; i <= word.length(); i++) {
                prefix = word.substring(0, i);
                if (dictSet.contains(prefix)) {
                    break;
                }
            }
            result.append(prefix).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");
        String sentence = "the cattle was rattled by the battery";
        String modifiedSentence = replace(dictionary, sentence);
        System.out.println(modifiedSentence);
    }
}
