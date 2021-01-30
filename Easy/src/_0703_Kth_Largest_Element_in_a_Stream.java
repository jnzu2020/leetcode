import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _0703_Kth_Largest_Element_in_a_Stream {
    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(3, nums);
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }
}

class KthLargest {
    private final int k;
    private final List<Integer> list;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
    }

    public int add(int val) {
        list.add(val);
        list.sort(Collections.reverseOrder());
        return list.get(k - 1);
    }
}
