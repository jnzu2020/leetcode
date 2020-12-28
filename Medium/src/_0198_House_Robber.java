import java.util.ArrayList;
import java.util.List;

public class _0198_House_Robber {
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        list.add(Math.max(nums[0], nums[1]));
        for (int i = 2 ; i < nums.length ; i++) {
            list.add(Math.max(list.get(i - 1), list.get(i - 2) + nums[i]));
        }
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        System.out.println(rob(nums1));

        int[] nums2 = {2,7,9,3,1};
        System.out.println(rob(nums2));
    }
}
