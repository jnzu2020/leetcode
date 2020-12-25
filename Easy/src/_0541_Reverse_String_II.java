public class _0541_Reverse_String_II {
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0 ; i < s.length() ; ) {
            int index1 = i;
            int index2 = Math.min(i + k - 1, s.length() - 1);
            while (index1 < index2) {
                char temp = chars[index2];
                chars[index2] = chars[index1];
                chars[index1] = temp;
                index1++;
                index2--;
            }
            i += 2 * k;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}
