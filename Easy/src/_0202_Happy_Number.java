import java.util.ArrayList;
import java.util.List;

public class _0202_Happy_Number {
    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while (true) {
            String[] str = Integer.toString(list.get(list.size() - 1)).split("");
            int sum = 0;
            for (String s : str) {
                sum += Math.pow(Integer.parseInt(s), 2);
            }
            if (sum == 1) {
                return true;
            } else if (list.contains(sum)) {
                return false;
            } else {
                list.add(sum);
            }
        }
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
