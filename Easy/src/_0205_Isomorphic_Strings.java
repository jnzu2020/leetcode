import java.util.HashMap;
import java.util.Map;

public class _0205_Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.equals(t)) {
            return true;
        }

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0 ; i < s.length() ; i++) {
            if ((!map.containsKey(s.charAt(i))) && (!map.containsValue(t.charAt(i)))) {
                map.put(s.charAt(i), t.charAt(i));
            }
            if ((!map.containsKey(s.charAt(i)) && (map.containsValue(t.charAt(i)))) ||
                    (map.containsKey(s.charAt(i)) && (!map.containsValue(t.charAt(i)))) ||
                    (!(map.get(s.charAt(i))).equals(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";
        System.out.println(isIsomorphic(s1, t1));

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(isIsomorphic(s2, t2));

        String s3 = "paper";
        String t3 = "title";
        System.out.println(isIsomorphic(s3, t3));

        String s4 = "ab";
        String t4 = "aa";
        System.out.println(isIsomorphic(s4, t4));
    }
}
