import java.util.Arrays;

public class _0496_Next_Greater_Element_I {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0 ; i < nums1.length ; i++) {
            boolean find = false;
            for (int j = 0 ; j < nums2.length ; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j + 1 ; k < nums2.length ; k++) {
                        if (nums2[k] > nums1[i]) {
                            result[i] = nums2[k];
                            find = true;
                            break;
                        }
                    }
                    if (find) {
                        break;
                    } else {
                        result[i] = -1;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1_1 = {4, 1, 2};
        int[] nums1_2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1_1, nums1_2)));

        int[] nums2_1 = {2, 4};
        int[] nums2_2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nextGreaterElement(nums2_1, nums2_2)));
    }
}
