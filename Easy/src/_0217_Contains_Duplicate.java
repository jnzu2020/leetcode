import java.util.HashSet;
import java.util.Set;

public class _0217_Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        System.out.println(containsDuplicate(nums1));

        int[] nums2 = {1,2,3,4};
        System.out.println(containsDuplicate(nums2));

        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums3));
    }
}
