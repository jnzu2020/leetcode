public class _7_Reverse_Integer {
    public static int reverse(int x) {
        boolean negative = false;
        if(x == 0) {
            return 0;
        } else if(x < 0) {
            negative = true;
            x *= (-1);
        }

        String str = Integer.toString(x);
        if(x % 10 == 0) {
            while (str.charAt(str.length() - 1) == '0') {
                str = str.substring(0, str.length() - 1);
            }
        }
        String solutionStr = new StringBuffer(str).reverse().toString();

        try {
            int solution = Integer.parseInt(solutionStr);
            return negative ? solution * (-1) : solution;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void main(String[] args) {
        int test1 = 1534236469;
        System.out.println(reverse(test1));

        int test2 = -123;
        System.out.println(reverse(test2));

        int test3 = 120;
        System.out.println(reverse(test3));

    }
}
