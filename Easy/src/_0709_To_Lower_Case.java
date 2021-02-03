public class _0709_To_Lower_Case {
    public static String toLowerCase(String str) {
        if (str.length() == 0) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                stringBuilder.append((char) (c + 32));
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(toLowerCase(str1));

        String str2 = "here";
        System.out.println(toLowerCase(str2));

        String str3 = "LOVELY";
        System.out.println(toLowerCase(str3));
    }
}
