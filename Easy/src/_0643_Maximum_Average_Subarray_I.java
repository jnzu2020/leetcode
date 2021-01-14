public class _0643_Maximum_Average_Subarray_I {
    public static double findMaxAverage(int[] nums, int k) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1 ; i < nums.length ; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        double result = ((double) sum[k - 1]) / k;
        for (int i = k ; i < sum.length ; i++) {
            double avg = ((double) (sum[i] - sum[i - k])) / k;
            result = Math.max(result, avg);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
}
