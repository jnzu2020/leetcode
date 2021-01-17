public class _0657_Robot_Return_to_Origin {
    public static boolean judgeCircle(String moves) {
        int position_x = 0;
        int position_y = 0;
        for (char move : moves.toCharArray()) {
            if (move == 'R') {
                position_x++;
            } else if (move == 'L') {
                position_x--;
            } else if (move == 'U') {
                position_y--;
            } else {
                position_y++;
            }
        }
        return position_x == 0 && position_y == 0;
    }

    public static void main(String[] args) {
        String moves1 = "UD";
        System.out.println(judgeCircle(moves1));

        String moves2 = "LL";
        System.out.println(judgeCircle(moves2));

        String moves3 = "RRDD";
        System.out.println(judgeCircle(moves3));

        String moves4 = "LDRRLRUULR";
        System.out.println(judgeCircle(moves4));
    }
}
