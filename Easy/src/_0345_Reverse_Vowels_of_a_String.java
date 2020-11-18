public class _0345_Reverse_Vowels_of_a_String {
    public static String reverseVowels(String s) {
        String[] array = s.split("");
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (!isVowel(array[left])) {
                left++;
            }
            if (!isVowel(array[right])) {
                right--;
            }
            if (isVowel(array[left]) && isVowel(array[right])) {
                String temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return String.join("", array);
    }

    private static boolean isVowel(String s) {
        return s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u") ||
               s.equals("A") || s.equals("E") || s.equals("I") || s.equals("O") || s.equals("U");
    }

    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(reverseVowels(s1));

        String s2 = "leetcode";
        System.out.println(reverseVowels(s2));

        String s3 = "aA";
        System.out.println(reverseVowels(s3));
    }
}
