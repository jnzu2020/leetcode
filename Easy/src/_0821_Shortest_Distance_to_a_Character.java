import java.util.Arrays;

public class _0821_Shortest_Distance_to_a_Character {
    public static int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        int leftIndexOfC = -10001;
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) == c) {
                leftIndexOfC = i;
            }
            result[i] = i - leftIndexOfC;
        }

        int rightIndexOfC = 10001;
        for (int i = s.length() - 1 ; i >= 0 ; i--) {
            if (s.charAt(i) == c) {
                rightIndexOfC = i;
            }
            result[i] = Math.min(result[i], rightIndexOfC - i);
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "loveleetcode";
        char c1 = 'e';
        System.out.println(Arrays.toString(shortestToChar(s1, c1)));

        String s2 = "aaab";
        char c2 = 'b';
        System.out.println(Arrays.toString(shortestToChar(s2, c2)));
    }
}
