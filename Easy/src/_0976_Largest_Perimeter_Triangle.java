import java.util.Arrays;

public class _0976_Largest_Perimeter_Triangle {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i - 2 >= 0 ; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 1, 2};
        System.out.println(largestPerimeter(nums1));

        int[] nums2 = {1, 2, 1};
        System.out.println(largestPerimeter(nums2));

        int[] nums3 = {3, 2, 3, 4};
        System.out.println(largestPerimeter(nums3));

        int[] nums4 = {3, 6, 2, 3};
        System.out.println(largestPerimeter(nums4));
    }
}
