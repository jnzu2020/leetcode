import java.util.Arrays;

public class _0905_Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int index = 0;
        for (int a : A) {
            if (a % 2 == 0) {
                result[index] = a;
                index++;
            }
        }

        for (int a : A) {
            if (a % 2 != 0) {
                result[index] = a;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(A)));
    }
}
