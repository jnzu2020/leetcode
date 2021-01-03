import java.util.HashSet;
import java.util.Set;

public class _0575_Distribute_Candies {
    public static int distributeCandies(int[] candyType) {
        Set<Integer> setOfCandyType = new HashSet<>();
        for (int type : candyType) {
            setOfCandyType.add(type);
        }
        return Math.min(setOfCandyType.size(), candyType.length / 2);
    }

    public static void main(String[] args) {
        int[] candyType1 = {1, 1, 2, 2, 3, 3};
        System.out.println(distributeCandies(candyType1));

        int[] candyType2 = {1, 1, 2, 3};
        System.out.println(distributeCandies(candyType2));

        int[] candyType3 = {6, 6, 6, 6};
        System.out.println(distributeCandies(candyType3));
    }
}
