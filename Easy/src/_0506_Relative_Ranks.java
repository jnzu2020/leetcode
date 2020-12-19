import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _0506_Relative_Ranks {
    public static String[] findRelativeRanks(int[] nums) {
        Integer[] integerNums = new Integer[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            integerNums[i] = nums[i];
            map.put(nums[i], i);
        }

        Arrays.sort(integerNums, Collections.reverseOrder());
        String[] result = new String[nums.length];
        for (int i = 0; i < integerNums.length; i++) {
            int score = integerNums[i];
            int indexOfScore = map.get(score);
            if (i == 0) {
                result[indexOfScore] = "Gold Medal";
            } else if (i == 1) {
                result[indexOfScore] = "Silver Medal";
            } else if (i == 2) {
                result[indexOfScore] = "Bronze Medal";
            } else {
                result[indexOfScore] = (i + 1) + "";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(findRelativeRanks(nums1)));

        int[] nums2 = {4, 3, 5, 1, 2};
        System.out.println(Arrays.toString(findRelativeRanks(nums2)));
    }
}
