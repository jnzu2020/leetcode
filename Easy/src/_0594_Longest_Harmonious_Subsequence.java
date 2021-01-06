import java.util.HashMap;
import java.util.Map;

public class _0594_Longest_Harmonious_Subsequence {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int result = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                result = Math.max(result, map.get(key) + map.get(key + 1));
            }
        }
        return result ;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums1));

        int[] nums2 = {1,2,3,4};
        System.out.println(findLHS(nums2));

        int[] nums3 = {1,1,1,1};
        System.out.println(findLHS(nums3));
    }
}
