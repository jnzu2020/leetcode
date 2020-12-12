public class _0482_License_Key_Formatting {
    public static String licenseKeyFormatting(String S, int K) {
        String replace = S.replace("-", "");
        if (replace.length() == 0) {
            return replace;
        }
        replace = replace.toUpperCase();
        int index = replace.length() - 1;
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (index >= 0) {
            if (count < K - 1) {
                stringBuilder.append(replace.charAt(index));
                index--;
                count++;
            } else {
                stringBuilder.append(replace.charAt(index)).append("-");
                index--;
                count = 0;
            }
        }
        String str = stringBuilder.reverse().toString();
        if (str.charAt(0) == '-') {
            str = str.substring(1);
        }

        return str;
    }

    public static void main(String[] args) {
        String s1 = "5F3Z-2e-9-w";
        int k1 = 4;
        System.out.println(licenseKeyFormatting(s1, k1));

        String s2 = "2-5g-3-J";
        int k2 = 2;
        System.out.println(licenseKeyFormatting(s2, k2));
    }
}
