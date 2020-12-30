import java.util.Arrays;

public class _0561_Array_Partition_I {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0 ; i < nums.length ; ) {
            result += nums[i];
            i += 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums1));

        int[] nums2 = {6, 2, 6, 5, 1, 2};
        System.out.println(arrayPairSum(nums2));
    }
}
