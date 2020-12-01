import java.util.ArrayList;
import java.util.Arrays;

public class _0414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        if (list.size() < 3) {
            return list.get(list.size() - 1);
        } else {
            return list.get(list.size() - 3);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1};
        System.out.println(thirdMax(nums1));

        int[] nums2 = {1, 2};
        System.out.println(thirdMax(nums2));

        int[] nums3 = {2, 2, 3, 1};
        System.out.println(thirdMax(nums3));
    }
}
