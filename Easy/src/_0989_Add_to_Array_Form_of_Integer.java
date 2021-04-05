import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class _0989_Add_to_Array_Form_of_Integer {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder str = new StringBuilder();
        for (int i : num) {
            str.append(i);
        }
        BigInteger bigInteger = new BigInteger(str.toString());
        BigInteger sum = bigInteger.add(BigInteger.valueOf(k));
        List<Integer> result = new ArrayList<>();
        for (char c : sum.toString().toCharArray()) {
            result.add(Character.getNumericValue(c));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 0, 0};
        int k1 = 34;
        System.out.println(addToArrayForm(num1, k1));

        int[] num2 = {2, 7, 4};
        int k2 = 181;
        System.out.println(addToArrayForm(num2, k2));

        int[] num3 = {2, 1, 5};
        int k3 = 806;
        System.out.println(addToArrayForm(num3, k3));

        int[] num4 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k4 = 1;
        System.out.println(addToArrayForm(num4, k4));
    }
}
