import java.util.Arrays;

public class _0242_Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] arrayOfS = s.toCharArray();
        char[] arrayOfT = t.toCharArray();
        Arrays.sort(arrayOfS);
        Arrays.sort(arrayOfT);
        String newS = Arrays.toString(arrayOfS);
        String newT = Arrays.toString(arrayOfT);
        return newS.equals(newT);
    }

    public static void main(String[] args) {
        String s1 = "anagram", t1 = "nagaram";
        System.out.println(isAnagram(s1, t1));

        String s2 = "rat", t2 = "car";
        System.out.println(isAnagram(s2, t2));
    }
}
