public class _0070_Climbing_Stairs {
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if(n == 2) {
            return 2;
        } else {
            int[] steps = new int[n + 1];
            steps[1] = 1;
            steps[2] = 2;
            for (int i = 3 ; i < n + 1 ; i++) {
                steps[i] = steps[i - 1] + steps[i - 2];
            }
            return steps[n];
        }
    }

    public static void main(String[] args) {
        int n1 = 2;
        System.out.println(climbStairs(n1));

        int n2 = 3;
        System.out.println(climbStairs(n2));

        int n3 = 4;
        System.out.println(climbStairs(n3));
    }
}
