public class _0292_Nim_Game {
    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        int n1 = 4;
        System.out.println(canWinNim(n1));

        int n2 = 1;
        System.out.println(canWinNim(n2));

        int n3 = 2;
        System.out.println(canWinNim(n3));
    }
}
