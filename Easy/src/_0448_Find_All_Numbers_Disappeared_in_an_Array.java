import java.util.ArrayList;
import java.util.List;

public class _0448_Find_All_Numbers_Disappeared_in_an_Array {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        boolean[] index = new boolean[nums.length];
        for (int num : nums) {
            index[num - 1] = true;
        }
        for (int i = 0 ; i < index.length ; i++) {
            if (!index[i]) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums1));

        int[] nums2 = {1,2,3,3};
        System.out.println(findDisappearedNumbers(nums2));

        int[] nums3 = {1,1};
        System.out.println(findDisappearedNumbers(nums3));

        int[] nums4 = {2,2};
        System.out.println(findDisappearedNumbers(nums4));
    }
}
