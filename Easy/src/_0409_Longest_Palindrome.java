import java.util.HashMap;

public class _0409_Longest_Palindrome {
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        boolean hasOdd = false;
        int result = 0;
        for (int i : map.values()) {
            if (i % 2 == 0) {
                result += i;
            } else {
                result += (i - 1);
                hasOdd = true;
            }
        }
        return hasOdd ? ++ result : result;
    }

    public static void main(String[] args) {
        String s1 = "abccccdd";
        System.out.println(longestPalindrome(s1));

        String s2 = "a";
        System.out.println(longestPalindrome(s2));

        String s3 = "bb";
        System.out.println(longestPalindrome(s3));

        String s4 = "aA";
        System.out.println(longestPalindrome(s4));

        String s5 = "asdfaefEWEFdfadsfEFED";
        System.out.println(longestPalindrome(s5));
    }
}
