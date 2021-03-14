import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _0893_Groups_of_Special_Equivalent_Strings {
    public static int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String str : A) {
            int[] odd = new int[26];
            int[] even = new int[26];
            for (int i = 0 ; i < str.length() ; i++) {
                char c = str.charAt(i);
                if (i % 2 == 0) {
                    even[c - 'a']++;
                } else {
                    odd[c - 'a']++;
                }
            }
            set.add(Arrays.toString(odd) + " " + Arrays.toString(even));
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] A1 = {"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"};
        System.out.println(numSpecialEquivGroups(A1));

        String[] A2 = {"abc", "acb", "bac", "bca", "cab", "cba"};
        System.out.println(numSpecialEquivGroups(A2));
    }
}
