import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class _0720_Longest_Word_in_Dictionary {
    public static String longestWord(String[] words) {
        String result = "";
        Arrays.sort(words, Comparator.comparingInt(String::length));
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                result = (word.length() > result.length() || word.compareTo(result) < 1) ? word : result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] word1 = {"w", "wo", "wor", "worl", "world"};
        System.out.println(longestWord(word1));

        String[] word2 = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        System.out.println(longestWord(word2));
    }
}
