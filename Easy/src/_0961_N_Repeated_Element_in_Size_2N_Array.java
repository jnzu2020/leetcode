import java.util.HashMap;
import java.util.Map;

public class _0961_N_Repeated_Element_in_Size_2N_Array {
    public static int repeatedNTimes(int[] A) {
        final int N = A.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (int a : map.keySet()) {
            if (map.get(a) == N) {
                return a;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 3};
        System.out.println(repeatedNTimes(a1));

        int[] a2 = {2, 1, 2, 5, 3, 2};
        System.out.println(repeatedNTimes(a2));

        int[] a3 = {5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println(repeatedNTimes(a3));
    }
}
