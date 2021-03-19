import java.util.HashMap;
import java.util.Map;

public class _0914_X_of_a_Kind_in_a_Deck_of_Cards {
    public static boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int d : deck) {
            if (!map.containsKey(d)) {
                map.put(d, 1);
            } else {
                map.put(d, map.get(d) + 1);
            }
        }
        int gcd = 0;
        for (int value : map.values()) {
            gcd = gcd(gcd, value);
        }
        return gcd > 1;
    }

    private static int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }

    public static void main(String[] args) {
        int[] deck1 = {1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(hasGroupsSizeX(deck1));

        int[] deck2 = {1, 1, 1, 2, 2, 2, 3, 3};
        System.out.println(hasGroupsSizeX(deck2));

        int[] deck3 = {1};
        System.out.println(hasGroupsSizeX(deck3));

        int[] deck4 = {1, 1};
        System.out.println(hasGroupsSizeX(deck4));

        int[] deck5 = {1, 1, 2, 2, 2, 2};
        System.out.println(hasGroupsSizeX(deck5));
    }
}
