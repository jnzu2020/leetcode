import java.util.ArrayList;
import java.util.List;

public class _0682_Baseball_Game {
    public static int calPoints(String[] ops) {
        List<Integer> scores = new ArrayList<>();
        for (String op : ops) {
            switch (op) {
                case "C":
                    scores.remove(scores.get(scores.size() - 1));
                    break;
                case "D":
                    int previousScore = scores.get(scores.size() - 1);
                    scores.add(previousScore * 2);
                    break;
                case "+":
                    int previousScore1 = scores.get(scores.size() - 1);
                    int previousScore2 = scores.get(scores.size() - 2);
                    scores.add(previousScore1 + previousScore2);
                    break;
                default:
                    scores.add(Integer.parseInt(op));
                    break;
            }
        }
        int result = 0;
        for (int score : scores) {
            result += score;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] ops1 = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(ops1));

        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPoints(ops2));

        String[] ops3 = {"1"};
        System.out.println(calPoints(ops3));
    }
}
