import java.util.HashMap;
import java.util.Map;

public class _0387_First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println(firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s2));
    }
}
