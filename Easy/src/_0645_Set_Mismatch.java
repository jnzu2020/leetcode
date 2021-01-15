import java.util.*;

public class _0645_Set_Mismatch {
    public static int[] findErrorNums(int[] nums) {
        int twice = 0;
        int missing = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int i = 1 ; i <= nums.length ; i++) {
            if (!map.containsKey(i)) {
                missing = i;
            } else if (map.get(i) != 1) {
                twice = i;
            }
        }
        return new int[] {twice, missing};
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(nums1)));

        int[] nums2 = {1, 1};
        System.out.println(Arrays.toString(findErrorNums(nums2)));
    }
}
