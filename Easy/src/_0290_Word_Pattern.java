import java.util.HashMap;
import java.util.Map;

public class _0290_Word_Pattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] wordsArray = s.split(" ");
        if (pattern.length() != wordsArray.length) {
            return false;
        }
        Map<Character, String> chars = new HashMap<>();
        Map<String, Character> words = new HashMap<>();

        for (int i = 0 ; i < wordsArray.length ; i++) {
            char c = pattern.charAt(i);
            String str = wordsArray[i];
            if (!chars.containsKey(c)) {
                if (words.containsKey(str)) {
                    return false;
                }
                chars.put(c, str);
                words.put(str, c);
            } else {
                if (!chars.get(c).equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        System.out.println(wordPattern(pattern1, s1));

        String pattern2 = "abba";
        String s2 = "dog cat dog cat";
        System.out.println(wordPattern(pattern2, s2));

        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        System.out.println(wordPattern(pattern3, s3));

        String pattern4 = "abba";
        String s4 = "dog dog dog dog";
        System.out.println(wordPattern(pattern4, s4));

        String pattern5 = "abc";
        String s5 = "b c a";
        System.out.println(wordPattern(pattern5, s5));
    }
}
