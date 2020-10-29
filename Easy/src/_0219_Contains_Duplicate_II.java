import java.util.HashMap;
import java.util.Map;

public class _0219_Contains_Duplicate_II {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            if (map.containsKey(nums[i]) && (Math.abs(map.get(nums[i]) - i) <= k)) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int k1 = 3;
        System.out.println(containsNearbyDuplicate(nums1, k1));

        int[] nums2 = {1,0,1,1};
        int k2 = 1;
        System.out.println(containsNearbyDuplicate(nums2, k2));

        int[] nums3 = {1,2,3,1,2,3};
        int k3 = 2;
        System.out.println(containsNearbyDuplicate(nums3, k3));

    }
}
