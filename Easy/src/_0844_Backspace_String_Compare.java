import java.util.ArrayList;
import java.util.List;

public class _0844_Backspace_String_Compare {
    public static boolean backspaceCompare(String S, String T) {
        return emptyText(S).equals(emptyText(T));
    }

    private static String emptyText(String str) {
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                list.add(c);
            } else {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
            }
        }
        return String.valueOf(list);
    }

    public static void main(String[] args) {
        String S1 = "ab#c";
        String T1 = "ad#c";
        System.out.println(backspaceCompare(S1, T1));

        String S2 = "ab##";
        String T2 = "c#d#";
        System.out.println(backspaceCompare(S2, T2));

        String S3 = "a##c";
        String T3 = "#a#c";
        System.out.println(backspaceCompare(S3, T3));

        String S4 = "a#c";
        String T4 = "b";
        System.out.println(backspaceCompare(S4, T4));
    }
}
