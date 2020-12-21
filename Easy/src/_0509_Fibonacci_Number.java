public class _0509_Fibonacci_Number {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n1 = 2;
        System.out.println(fib(n1));

        int n2 = 3;
        System.out.println(fib(n2));

        int n3 = 4;
        System.out.println(fib(n3));
    }
}
