import java.util.*;

public class _0884_Uncommon_Words_from_Two_Sentences {
    public static String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        for (String aWord : A.split(" ")) {
            if (!map.containsKey(aWord)) {
                map.put(aWord, 1);
            } else {
                map.put(aWord, map.get(aWord) + 1);
            }
        }

        for (String bWord : B.split(" ")) {
            if (!map.containsKey(bWord)) {
                map.put(bWord, 1);
            } else {
                map.put(bWord, map.get(bWord) + 1);
            }
        }

        List<String> list = new ArrayList<>();
        for (String str : map.keySet()) {
            if (map.get(str) == 1) {
                list.add(str);
            }
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String A1 = "this apple is sweet";
        String B1 = "this apple is sour";
        System.out.println(Arrays.toString(uncommonFromSentences(A1, B1)));

        String A2 = "apple apple";
        String B2 = "banana";
        System.out.println(Arrays.toString(uncommonFromSentences(A2, B2)));
    }
}
