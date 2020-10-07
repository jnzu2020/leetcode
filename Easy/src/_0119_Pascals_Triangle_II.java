import java.util.ArrayList;
import java.util.List;

public class _0119_Pascals_Triangle_II {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        if (rowIndex < 0) {
            return result;
        }
        result.add(1);
        if (rowIndex == 0) {
            return result;
        }
        result.add(1);
        if (rowIndex == 1) {
            return result;
        }
        int round = rowIndex - 1;
        while (round > 0) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int i = 0 ; i < result.size() - 1 ; i++) {
                temp.add(result.get(i) + result.get(i + 1));
            }
            temp.add(1);
            result = temp;
            round--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getRow(0));
        System.out.println(getRow(1));
        System.out.println(getRow(2));
        System.out.println(getRow(3));
        System.out.println(getRow(4));
    }
}
