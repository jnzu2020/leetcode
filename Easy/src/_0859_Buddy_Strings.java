import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0859_Buddy_Strings {
    public static boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            Set<Character> set = new HashSet<>();
            for (char c : A.toCharArray()) {
                set.add(c);
            }
            return set.size() != A.length();
        } else {
            List<Character> listA = new ArrayList<>();
            List<Character> listB = new ArrayList<>();
            for (int i = 0 ; i < A.length() ; i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    listA.add(A.charAt(i));
                    listB.add(B.charAt(i));
                }
            }
            return listA.size() == 2 &&
                    listB.size() == 2 &&
                    listA.get(0) == listB.get(1) &&
                    listA.get(1) == listB.get(0);
        }
    }

    public static void main(String[] args) {
        String A1 = "ab"; String B1 = "ba";
        System.out.println(buddyStrings(A1, B1));

        String A2 = "ab"; String B2 = "ab";
        System.out.println(buddyStrings(A2, B2));

        String A3 = "aa"; String B3 = "aa";
        System.out.println(buddyStrings(A3, B3));

        String A4 = "aaaaaaabc"; String B4 = "aaaaaaacb";
        System.out.println(buddyStrings(A4, B4));

        String A5 = ""; String B5 = "aa";
        System.out.println(buddyStrings(A5, B5));
    }
}
