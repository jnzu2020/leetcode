import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _0500_Keyboard_Row {
    public static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        Map<Character, Integer> keyboard = new HashMap<>();
        for (int i = 0 ; i < row1.length() ; i++) {
            keyboard.put(row1.charAt(i), 1);
        }
        for (int i = 0 ; i < row2.length() ; i++) {
            keyboard.put(row2.charAt(i), 2);
        }
        for (int i = 0 ; i < row3.length() ; i++) {
            keyboard.put(row3.charAt(i), 3);
        }
        StringBuilder resultStr = new StringBuilder();
        for (String word : words) {
            String lowerCase = word.toLowerCase();
            int index = keyboard.get(lowerCase.charAt(0));
            boolean sameRow = true;
            for (int i = 1 ; i < lowerCase.length() ; i++) {
                if (keyboard.get(lowerCase.charAt(i)) != index) {
                    sameRow = false;
                    break;
                }
            }
            if (sameRow) {
                resultStr.append(word).append(",");
            }
        }
        if (resultStr.toString().length() == 0) {
            return new String[0];
        } else {
            return resultStr.toString().split(",");
        }
    }

    public static void main(String[] args) {
        String[] words1 = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words1)));

        String[] words2 = {};
        System.out.println(Arrays.toString(findWords(words2)));

        String[] words3 = {"qz","wq","asdddafadsfa","adfadfadfdassfawde"};
        System.out.println(Arrays.toString(findWords(words3)));

        String[] words4 = {"asdfghjklASDFGHJKLasdfghjklASDFGHJKLzxcvbnmZXCVBNMaew",
                "asdfghjklASDFGHJKLqwertyuiopQWERTYUIOP",
                "zxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaew"};
        System.out.println(Arrays.toString(findWords(words4)));
    }
}
