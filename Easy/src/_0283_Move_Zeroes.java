import java.util.Arrays;

public class _0283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        for (int i = 0 ; i < nums.length ; i++) {
            for (int j = 0 ; j < nums.length - 1 ; j++) {
                if (nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
