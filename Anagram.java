import java.util.*;

public class Anagram {
    static void anagram(String s, String p) {
        if (s.length() < p.length()) return;

        // Initialize the frequency arrays
        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Fill the frequency array for p and the first window in s
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        List<Integer> res = new ArrayList<>();
        // Compare frequency arrays for the first window
        if (Arrays.equals(pCount, sCount)) {
            res.add(0);
        }

        // Slide the window over string s
        for (int i = p.length(); i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            sCount[s.charAt(i - p.length()) - 'a']--;

            // Compare frequency arrays for the current window
            if (Arrays.equals(pCount, sCount)) {
                res.add(i - p.length() + 1);
            }
        }

        // Print the results
        for (int index : res) {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        anagram(s, p);
    }
}
