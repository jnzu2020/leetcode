import java.util.ArrayList;
import java.util.List;

public class _0824_Goat_Latin {
    public static String toGoatLatin(String S) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        StringBuilder stringBuilder = new StringBuilder();
        String strOfAs = "";
        for (String str : S.split(" ")) {
            strOfAs += "a";
            if (list.contains(str.charAt(0))) {
                stringBuilder.append(str).append("ma").append(strOfAs).append(" ");
            } else {
                String newStr = str.substring(1);
                stringBuilder.append(newStr).append(str.charAt(0)).append("ma").append(strOfAs).append(" ");
            }
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String S1 = "I speak Goat Latin";
        System.out.println(toGoatLatin(S1));

        String S2 = "The quick brown fox jumped over the lazy dog";
        System.out.println(toGoatLatin(S2));
    }
}
