import java.util.HashMap;
import java.util.Map;

public class _0771_Jewels_and_Stones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char stone : stones.toCharArray()) {
            if (map.containsKey(stone)) {
                map.put(stone, map.get(stone) + 1);
            } else {
                map.put(stone, 1);
            }
        }
        for (char jewel : jewels.toCharArray()) {
            if (map.containsKey(jewel)) {
                count += map.get(jewel);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels1 = "aA", stones1 = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels1, stones1));

        String jewels2 = "z", stones2 = "ZZ";
        System.out.println(numJewelsInStones(jewels2, stones2));
    }
}
