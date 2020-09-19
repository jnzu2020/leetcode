import java.util.regex.Pattern;

public class _0020_Valid_Parentheses {
    public static boolean isValid(String s) {
        if(s.length() < 1 || s.length() > Math.pow(10, 4)) {
            return false;
        }

        if(s.length() % 2 != 0) {
            return false;
        }

        if (s.charAt(0) != '(' && s.charAt(0) != '[' && s.charAt(0) != '{') {
            return false;
        }

        String pattern = "[()\\[\\]{}]+";
        if(!Pattern.matches(pattern, s)) {
            return false;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stringBuilder.append(s.charAt(i));
            } else {
                if (stringBuilder.length() == 0) {
                    return false;
                } else if (stringBuilder.charAt(stringBuilder.length() - 1) == '(' && s.charAt(i) == ')') {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                } else if (stringBuilder.charAt(stringBuilder.length() - 1) == '[' && s.charAt(i) == ']') {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                } else if (stringBuilder.charAt(stringBuilder.length() - 1) == '{' && s.charAt(i) == '}') {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                } else {
                    return false;
                }
            }
        }
        return stringBuilder.length() == 0;
    }

    public static void main(String[] args) {
        String test1 = "()";
        System.out.println(test1 + ": " + isValid(test1));

        String test2 = "()[]{}";
        System.out.println(test2 + ": " + isValid(test2));

        String test3 = "(]";
        System.out.println(test3 + ": " + isValid(test3));

        String test4 = "([)]";
        System.out.println(test4 + ": " + isValid(test4));

        String test5 = "{[]}";
        System.out.println(test5 + ": " + isValid(test5));

        String test6 = "][}{";
        System.out.println(test6 + ": " + isValid(test6));

        String test7 = "){";
        System.out.println(test7 + ": " + isValid(test7));

        String test8 = "(([]){})";
        System.out.println(test8 + ": " + isValid(test8));
    }
}
