public class _0746_Min_Cost_Climbing_Stairs {
    public static int minCostClimbingStairs(int[] cost) {
        int step1 = 0, step2 = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            int step_current = cost[i] + Math.min(step1, step2);
            step2 = step1;
            step1 = step_current;
        }
        return Math.min(step1, step2);
    }

    public static void main(String[] args) {
        int[] cost1 = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost1));

        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(cost2));
    }
}
