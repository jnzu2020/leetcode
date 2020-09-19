import java.util.LinkedHashMap;
import java.util.Map;

public class _0013_Roman_to_Integer {
    public static int romanToInt(String s) {
        Map<Integer, Integer>map = new LinkedHashMap<>();
        int intOfRoman = 0;

        map.put(4, findTheNumOfSubtraction(s, "IV"));
        s = s.replaceAll("IV", "");

        map.put(9, findTheNumOfSubtraction(s, "IX"));
        s = s.replaceAll("IX", "");

        map.put(40, findTheNumOfSubtraction(s, "XL"));
        s = s.replaceAll("XL", "");

        map.put(90, findTheNumOfSubtraction(s, "XC"));
        s = s.replaceAll("XC", "");

        map.put(400, findTheNumOfSubtraction(s, "CD"));
        s = s.replaceAll("CD", "");

        map.put(900, findTheNumOfSubtraction(s, "CM"));
        s = s.replaceAll("CM", "");

        map.put(1, findTheNumOfSubtraction(s, "I"));
        map.put(5, findTheNumOfSubtraction(s, "V"));
        map.put(10, findTheNumOfSubtraction(s, "X"));
        map.put(50, findTheNumOfSubtraction(s, "L"));
        map.put(100, findTheNumOfSubtraction(s, "C"));
        map.put(500, findTheNumOfSubtraction(s, "D"));
        map.put(1000, findTheNumOfSubtraction(s, "M"));

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            intOfRoman += (set.getKey() * set.getValue());
        }

        return intOfRoman;
    }

    /**
     * find how many instances where subtraction is used in a string
     * @param s The string
     * @param subtraction The instances where subtraction is used
     * @return count The number of instances where subtraction is used
     */
    public static int findTheNumOfSubtraction(String s, String subtraction) {
        return (s.length()-s.replace(subtraction, "").length())/subtraction.length();
    }

    public static void main(String[] args) {
        String test1 = "III";
        System.out.println(romanToInt(test1));

        String test2 = "IV";
        System.out.println(romanToInt(test2));

        String test3 = "IX";
        System.out.println(romanToInt(test3));

        String test4 = "LVIII";
        System.out.println(romanToInt(test4));

        String test5 = "MCMXCIV";
        System.out.println(romanToInt(test5));
    }
}
