public class _0696_Count_Binary_Substrings {
    public static int countBinarySubstrings(String s) {
        int[] countArray = new int[s.length()];
        int index = 0;
        int count = 1;
        for (int i = 0 ; i < s.length() - 1 ; i++) {
            if (s.charAt(i + 1) == s.charAt(i)) {
                count++;
            } else {
                countArray[index] = count;
                index++;
                count = 1;
            }
        }
        countArray[index] = count;
        int result = 0;
        for (int i = 0 ; i < countArray.length - 1 ; i++) {
            result += Math.min(countArray[i], countArray[i + 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "00110011";
        System.out.println(countBinarySubstrings(s1));

        String s2 = "10101";
        System.out.println(countBinarySubstrings(s2));
    }
}
