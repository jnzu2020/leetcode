public class _0598_Range_Addition_II {
    public static int maxCount(int m, int n, int[][] ops) {
        if (ops == null || ops.length == 0) {
            return m * n;
        }
        int minOfX = m;
        int minOfY = n;
        for (int[] op : ops) {
            minOfX = Math.min(minOfX, op[0]);
            minOfY = Math.min(minOfY, op[1]);
        }
        return minOfX * minOfY;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int[][] ops1 = {{2, 2}, {3, 3}};
        System.out.println(maxCount(m, n, ops1));

        int[][] ops2 = {{2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3},
                {3, 3}, {3, 3}};
        System.out.println(maxCount(m, n, ops2));

        int[][] ops3 = {};
        System.out.println(maxCount(m, n, ops3));
    }
}
