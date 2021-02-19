import java.util.ArrayList;
import java.util.List;

public class _0804_Unique_Morse_Code_Words {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseTable = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--",
                "-..-","-.--","--.."};
        List<String> morseList = new ArrayList<>();
        for (String word : words) {
            StringBuilder builder = new StringBuilder();
            for (char c : word.toCharArray()) {
                builder.append(morseTable[c - 'a']);
            }
            if (!morseList.contains(builder.toString())) {
                morseList.add(builder.toString());
            }
        }
        return morseList.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
