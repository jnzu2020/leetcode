import java.util.LinkedList;
import java.util.List;

public class _0228_Summary_Ranges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();
        if (nums == null || nums.length == 0) {
            return result;
        }

        if (nums.length == 1) {
            stringBuilder.append(nums[0]);
            result.add(stringBuilder.toString());
            return result;
        }

        int startOfRange = nums[0];
        int endOfRange = nums[0];

        for (int i = 1 ; i < nums.length ; i++) {
            if ((endOfRange == nums[i] - 1)) {
                endOfRange = nums[i];
            } else {
                if (startOfRange == endOfRange) {
                    stringBuilder.append(startOfRange);
                } else {
                    stringBuilder.append(startOfRange).append("->").append(endOfRange);
                }
                result.add(stringBuilder.toString());
                stringBuilder.setLength(0);
                startOfRange = endOfRange = nums[i];
            }
        }

        if (startOfRange == endOfRange) {
            stringBuilder.append(startOfRange);
        } else {
            stringBuilder.append(startOfRange).append("->").append(endOfRange);
        }
        result.add(stringBuilder.toString());

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums1));

        int[] nums2 = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums2));

        int[] nums3 = {};
        System.out.println(summaryRanges(nums3));

        int[] nums4 = {-1};
        System.out.println(summaryRanges(nums4));

        int[] nums5 = {0};
        System.out.println(summaryRanges(nums5));
    }
}
