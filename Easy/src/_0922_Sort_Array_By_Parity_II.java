import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0922_Sort_Array_By_Parity_II {
    public static int[] sortArrayByParityII(int[] nums) {
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 1) {
                oddList.add(num);
            } else {
                evenList.add(num);
            }
        }
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0 ; i < result.length ; i += 2) {
            result[i] = evenList.get(index);
            result[i + 1] = oddList.get(index);
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 2, 5, 7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums1)));

        int[] nums2 = {2, 3};
        System.out.println(Arrays.toString(sortArrayByParityII(nums2)));
    }
}
