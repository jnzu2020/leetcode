public class _0953_Verifying_an_Alien_Dictionary {
    public static boolean isAlienSorted(String[] words, String order) {
        int[] orders = new int[26];
        for (int i = 0 ; i < orders.length ; i++) {
            orders[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (j >= words[i + 1].length()) {
                    return false;
                }
                if (words[i].charAt(j) != words[i + 1].charAt(j)) {
                    int charIndex_1 = words[i].charAt(j) - 'a';
                    int charIndex_2 = words[i + 1].charAt(j) - 'a';
                    if (orders[charIndex_1] > orders[charIndex_2]) {
                        return false;
                    } else {
                        break;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words1 = {"hello", "leetcode"};
        String order1 = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words1, order1));

        String[] words2 = {"word", "world", "row"};
        String order2 = "worldabcefghijkmnpqstuvxyz";
        System.out.println(isAlienSorted(words2, order2));

        String[] words3 = {"apple", "app"};
        String order3 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words3, order3));
    }
}
