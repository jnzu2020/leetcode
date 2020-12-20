import java.util.ArrayList;
import java.util.List;

public class _0507_Perfect_Number {
    public static boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1 ; i < Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (num / i != num) {
                    divisors.add(num / i);
                }
            }
        }
        int sum = 0;
        for (int i : divisors) {
            sum += i;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num1 = 28;
        System.out.println(checkPerfectNumber(num1));

        int num2 = 6;
        System.out.println(checkPerfectNumber(num2));

        int num3 = 496;
        System.out.println(checkPerfectNumber(num3));

        int num4 = 8128;
        System.out.println(checkPerfectNumber(num4));

        int num5 = 2;
        System.out.println(checkPerfectNumber(num5));
    }
}
