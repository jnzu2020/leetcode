import java.util.Arrays;

public class _0026_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
        }

        max++;
        int index = 0;
        int replace = 0;
        for (int i = 1 ; i < nums.length ; i++) {
            if (nums[index] == nums[i]) {
                nums[i] = max;
                replace++;
            } else {
                index = i;
            }
        }

        Arrays.sort(nums);
        return nums.length - replace;
    }

    public static void main(String[] args) {
        int[] test1 = {1,1,2};
        System.out.println(removeDuplicates(test1));
        System.out.println(Arrays.toString(test1));

        int[] test2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(test2));
        System.out.println(Arrays.toString(test2));

        int[] test3 = {1};
        System.out.println(removeDuplicates(test3));
        System.out.println(Arrays.toString(test3));
    }
}
