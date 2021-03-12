import java.util.Arrays;

public class _0888_Fair_Candy_Swap {
    public static int[] fairCandySwap(int[] A, int[] B) {
        int[] result = new int[2];
        int candyOfA = 0;
        int candyOfB = 0;
        for (int a : A) {
            candyOfA +=a;
        }

        for (int b : B) {
            candyOfB +=b;
        }

        for (int a : A) {
            for (int b : B) {
                int diff = a - b;
                if (candyOfA - diff == candyOfB + diff) {
                    result[0] = a;
                    result[1] = b;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 1};
        int[] B1 = {2, 2};
        System.out.println(Arrays.toString(fairCandySwap(A1, B1)));

        int[] A2 = {1, 2};
        int[] B2 = {2, 3};
        System.out.println(Arrays.toString(fairCandySwap(A2, B2)));

        int[] A3 = {2};
        int[] B3 = {1, 3};
        System.out.println(Arrays.toString(fairCandySwap(A3, B3)));

        int[] A4 = {1, 2, 5};
        int[] B4 = {2, 4};
        System.out.println(Arrays.toString(fairCandySwap(A4, B4)));
    }
}
