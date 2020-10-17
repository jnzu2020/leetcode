import java.util.HashMap;
import java.util.Map;

public class _0169_Majority_Element {
    public static int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int max = 0;
        int result = nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.get(i) != null) {
                int value = map.get(i);
                value++;
                map.put(i, value);
                if (max < value) {
                    max = value;
                    result = i;
                }
            } else {
                map.put(i, 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,2,3};
        System.out.println(majorityElement(nums1));

        int[] nums2 = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums2));
    }
}
