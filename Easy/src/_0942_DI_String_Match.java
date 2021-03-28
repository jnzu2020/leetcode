import java.util.Arrays;

public class _0942_DI_String_Match {
    public static int[] diStringMatch(String S) {
        int low = 0;
        int hight = S.length();
        int[] result = new int[S.length() + 1];
        for (int i = 0 ; i < S.length() ; i++) {
            if (S.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = hight--;
            }
        }
        result[result.length - 1] = hight;
        return result;
    }

    public static void main(String[] args) {
        String s1 = "IDID";
        System.out.println(Arrays.toString(diStringMatch(s1)));

        String s2 = "III";
        System.out.println(Arrays.toString(diStringMatch(s2)));

        String s3 = "DDI";
        System.out.println(Arrays.toString(diStringMatch(s3)));
    }
}
