import java.util.Arrays;

public class _0455_Assign_Cookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int indexOfG = 0;
        int indexOfS = 0;
        while ((indexOfG < g.length) && (indexOfS < s.length)) {
            if (g[indexOfG] <= s[indexOfS]) {
                result++;
                indexOfG++;
            }
            indexOfS++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] g1 = {1, 2, 3}, s1 = {1, 1};
        System.out.println(findContentChildren(g1, s1));

        int[] g2 = {1, 2}, s2 = {1, 2, 3};
        System.out.println(findContentChildren(g2, s2));
    }
}
