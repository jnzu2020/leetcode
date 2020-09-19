import java.util.Arrays;

public class _0027_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int maxOfNums = nums[0];
        for (int num : nums) {
            if (maxOfNums < num) {
                maxOfNums = num;
            }
        }
        maxOfNums++;

        Arrays.sort(nums);
        int replaceNum = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == val) {
                nums[i] = maxOfNums;
                replaceNum++;
            }
        }
        Arrays.sort(nums);
        return nums.length - replaceNum;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        System.out.println(removeElement(nums1, val1));

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println(removeElement(nums2, val2));
    }
}
