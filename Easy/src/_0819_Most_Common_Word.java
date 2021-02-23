import java.util.*;

public class _0819_Most_Common_Word {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String str = paragraph.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
        String[] words = str.split("\\s+");
        List<String> bannedList = new ArrayList<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!bannedList.contains(word)) {
                if (!map.containsKey(word)) {
                    map.put(word, 1);
                } else {
                    map.put(word, map.get(word) + 1);
                }
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball,  the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph, banned));
    }
}
