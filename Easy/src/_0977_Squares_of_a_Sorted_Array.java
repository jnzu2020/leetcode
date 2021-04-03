import java.util.Arrays;

public class _0977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0 ; i < result.length ; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums1)));

        int[] nums2 = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(nums2)));
    }
}
