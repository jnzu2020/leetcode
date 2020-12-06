public class _0453_Minimum_Moves_to_Equal_Array_Elements {
    public static int minMoves(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
        }
        int result = 0;
        for (int num : nums) {
            result += (num - min);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(minMoves(nums));
    }
}
