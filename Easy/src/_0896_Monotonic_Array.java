public class _0896_Monotonic_Array {
    public static boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1 ; i < A.length ; i++) {
            if (A[i - 1] < A[i]) {
                decreasing = false;
            }
            if (A[i - 1] > A[i]) {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 2, 2, 3};
        System.out.println(isMonotonic(A1));

        int[] A2 = {6, 5, 4, 4};
        System.out.println(isMonotonic(A2));

        int[] A3 = {1, 3, 2};
        System.out.println(isMonotonic(A3));

        int[] A4 = {1, 2, 4, 5};
        System.out.println(isMonotonic(A4));

        int[] A5 = {1, 1, 1};
        System.out.println(isMonotonic(A5));
    }
}
