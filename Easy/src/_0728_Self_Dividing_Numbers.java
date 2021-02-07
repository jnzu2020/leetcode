import java.util.ArrayList;
import java.util.List;

public class _0728_Self_Dividing_Numbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left ; i <= right ; i++) {
            boolean isSelfDividing = true;
            for (char c : String.valueOf(i).toCharArray()) {
                if (c == '0' || (i % Integer.parseInt(c + "") != 0)) {
                    isSelfDividing = false;
                    break;
                }
            }
            if (isSelfDividing) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int left = 1, right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }
}
