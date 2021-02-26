import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0830_Positions_of_Large_Groups {
    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int beginIndex = 0;
        for (int endIndex = 0 ; endIndex < s.length() ; endIndex++) {
            if (endIndex == s.length() - 1 || s.charAt(endIndex) != s.charAt(endIndex + 1)) {
                if (endIndex - beginIndex + 1 >= 3) {
                    result.add(Arrays.asList(beginIndex, endIndex));
                }
                beginIndex = endIndex + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "abbxxxxzzy";
        System.out.println(largeGroupPositions(s1));

        String s2 = "abc";
        System.out.println(largeGroupPositions(s2));

        String s3 = "abcdddeeeeaabbbcd";
        System.out.println(largeGroupPositions(s3));

        String s4 = "aba";
        System.out.println(largeGroupPositions(s4));
    }
}
