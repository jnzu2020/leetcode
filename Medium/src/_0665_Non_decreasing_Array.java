public class _0665_Non_decreasing_Array {
    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++) {
            if(nums[i] > nums[i + 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                if((count == 1) && (i + 2 < nums.length) && (i - 1 >= 0)) {
                    if((nums[i - 1] > nums[i + 1]) && (nums[i + 2] < nums[i]))
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 2, 3};
        System.out.println(checkPossibility(nums1));

        int[] nums2 = {4, 2, 1};
        System.out.println(checkPossibility(nums2));
    }
}
