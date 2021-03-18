public class _0908_Smallest_Range_I {
    public static int smallestRangeI(int[] A, int K) {
        int minA = A[0];
        int maxA = A[0];
        for (int a : A) {
            minA = Math.min(minA, a);
            maxA = Math.max(maxA, a);
        }
        return Math.max(maxA - minA - 2 * K, 0);
    }

    public static void main(String[] args) {
        int[] A1 = {1};
        int K1 = 0;
        System.out.println(smallestRangeI(A1, K1));

        int[] A2 = {0, 10};
        int K2 = 2;
        System.out.println(smallestRangeI(A2, K2));

        int[] A3 = {1, 3, 6};
        int K3 = 3;
        System.out.println(smallestRangeI(A3, K3));
    }
}
