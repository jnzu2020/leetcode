public class _0520_Detect_Capital {
    public static boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }
        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            for (int i = 2 ; i < word.length() ; i++) {
                if (!Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        } else if (Character.isUpperCase(word.charAt(0)) && !Character.isUpperCase(word.charAt(1))) {
            for (int i = 2 ; i < word.length() ; i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        } else if (!Character.isUpperCase(word.charAt(0))) {
            for (int i = 1 ; i < word.length() ; i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "USA";
        System.out.println(detectCapitalUse(word1));

        String word2 = "FlaG";
        System.out.println(detectCapitalUse(word2));
    }
}
