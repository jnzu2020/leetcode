import java.util.HashMap;

public class _0389_Find_the_Difference {
    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> sMap = saveStringToMap(s);
        HashMap<Character, Integer> tMap = saveStringToMap(t);
        for (char c : tMap.keySet()) {
            if (!sMap.containsKey(c)) {
                return c;
            } else if (tMap.get(c) > sMap.get(c)) {
                return c;
            }
        }
        return '0';
    }

    private static HashMap<Character, Integer> saveStringToMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0 ; i < str.length() ; i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String s1 = "abcd", t1 = "abcde";
        System.out.println(findTheDifference(s1, t1));

        String s2 = "", t2 = "y";
        System.out.println(findTheDifference(s2, t2));

        String s3 = "a", t3 = "aa";
        System.out.println(findTheDifference(s3, t3));

        String s4 = "ae", t4 = "aea";
        System.out.println(findTheDifference(s4, t4));
    }
}
