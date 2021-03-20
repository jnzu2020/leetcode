public class _0917_Reverse_Only_Letters {
    public static String reverseOnlyLetters(String S) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : S.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                stringBuilder.append(c);
            }
        }
        stringBuilder.reverse();
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (char c : S.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                result.append(stringBuilder.charAt(index++));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String S1 = "ab-cd";
        System.out.println(reverseOnlyLetters(S1));

        String S2 = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(S2));

        String S3 = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(S3));
    }
}
