import java.util.HashMap;
import java.util.Map;

public class _0383_Ransom_Note {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> ransomNoteMap = new HashMap<>();
        Map<Character,Integer> magazineMap = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            if (ransomNoteMap.containsKey(c)) {
                int value = ransomNoteMap.get(c);
                ransomNoteMap.put(c, ++value);
            } else {
                ransomNoteMap.put(c, 1);
            }
        }

        for (char c : magazine.toCharArray()) {
            if (magazineMap.containsKey(c)) {
                int value = magazineMap.get(c);
                magazineMap.put(c, ++value);
            } else {
                magazineMap.put(c, 1);
            }
        }

        for (char c : ransomNoteMap.keySet()) {
            if (!magazineMap.containsKey(c)) {
                return false;
            } else if (ransomNoteMap.get(c) > magazineMap.get(c)) {
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote1 = "a", magazine1 = "b";
        System.out.println(canConstruct(ransomNote1, magazine1));

        String ransomNote2 = "aa", magazine2 = "ab";
        System.out.println(canConstruct(ransomNote2, magazine2));

        String ransomNote3 = "aa", magazine3 = "aab";
        System.out.println(canConstruct(ransomNote3, magazine3));
    }
}