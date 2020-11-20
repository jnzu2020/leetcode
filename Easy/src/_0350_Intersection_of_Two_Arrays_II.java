import java.util.ArrayList;
import java.util.Arrays;

public class _0350_Intersection_of_Two_Arrays_II {
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int indexOfNums1 = 0;
        int indexOfNums2 = 0;
        while (indexOfNums1 < nums1.length && indexOfNums2 < nums2.length) {
            if (nums1[indexOfNums1] == nums2[indexOfNums2]) {
                list.add(nums1[indexOfNums1]);
                indexOfNums1++;
                indexOfNums2++;
            } else if (nums1[indexOfNums1] > nums2[indexOfNums2]) {
                indexOfNums2++;
            } else {
                indexOfNums1++;
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1_1 = {1,2,2,1};
        int[] nums1_2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1_1, nums1_2)));

        int[] nums2_1 = {4,9,5};
        int[] nums2_2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums2_1, nums2_2)));

        int[] nums3_1 = {1,2,2,1};
        int[] nums3_2 = {2};
        System.out.println(Arrays.toString(intersect(nums3_1, nums3_2)));
    }
}
