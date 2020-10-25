public class _0204_Count_Primes {
    public static int countPrimes(int n) {
        boolean[] isNotPrime = new boolean[n];
        int count = 0;

        for (int i = 2 ; i < n ; i++) {
            if (!isNotPrime[i]) {
                count++;
                for (int j = 2 ; i * j < n ; j++) {
                    isNotPrime[i * j] = true;
                }
            }
        }
        return count;
    }

    /**
     * another solution, less effective
     */
//    private static boolean isPrime(int num){
//        for(int i = 2 ; i <= Math.sqrt(num) ; i++){
//            if(num % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        int n1 = 10;
        System.out.println(countPrimes(n1));

        int n2 = 0;
        System.out.println(countPrimes(n2));

        int n3 = 1;
        System.out.println(countPrimes(n3));

        int n4 = 2;
        System.out.println(countPrimes(n4));

        int n5 = 3;
        System.out.println(countPrimes(n5));
    }
}
