import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _0697_Degree_of_an_Array {
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> leftIndex = new HashMap<>();
        Map<Integer, Integer> rightIndex = new HashMap<>();
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            if (!leftIndex.containsKey(nums[i])) {
                leftIndex.put(nums[i], i);
            }
            rightIndex.put(nums[i], i);
            if (!numsMap.containsKey(nums[i])) {
                numsMap.put(nums[i], 1);
            } else {
                numsMap.put(nums[i], numsMap.get(nums[i]) + 1);
            }
        }
        int degree = Collections.max(numsMap.values());
        int result = nums.length;
        for (int x : numsMap.keySet()) {
            if (numsMap.get(x) == degree) {
                result = Math.min(result, rightIndex.get(x) - leftIndex.get(x) + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums1));

        int[] nums2 = {1, 2, 2, 3, 1, 4, 2};
        System.out.println(findShortestSubArray(nums2));
    }
}
