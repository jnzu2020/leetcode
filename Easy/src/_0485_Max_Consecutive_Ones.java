public class _0485_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        boolean hasOne = false;
        for (int num : nums) {
            if (num == 1) {
                hasOne = true;
                break;
            }
        }

        if (!hasOne) {
            return 0;
        } else {
            int max = 0;
            int count = 1;
            for (int i = 0 ; i < nums.length - 1 ; i++) {
                if (nums[i] == 1 && nums[i + 1] == 1) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }
            max = Math.max(max, count);
            return max;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums1));

        int[] nums2 = {1,0,0,1,1,1,0,1,1};
        System.out.println(findMaxConsecutiveOnes(nums2));

        int[] nums3 = {0,0,0};
        System.out.println(findMaxConsecutiveOnes(nums3));
    }
}
