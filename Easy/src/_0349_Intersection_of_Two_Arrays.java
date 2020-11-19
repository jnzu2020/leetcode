import java.util.Arrays;
import java.util.HashSet;

public class _0349_Intersection_of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        for (int num : nums1) {
            hashSet1.add(num);
        }
        for (int num : nums2) {
            hashSet2.add(num);
        }
        hashSet1.retainAll(hashSet2);
        int[] result = new int[hashSet1.size()];
        int index = 0;
        for (int num : hashSet1) {
            result[index] = num;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num1_1 = {1,2,2,1};
        int[] num1_2 = {2,2};
        System.out.println(Arrays.toString(intersection(num1_1, num1_2)));

        int[] num2_1 = {4,9,5};
        int[] num2_2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(num2_1, num2_2)));
    }
}
