import java.util.ArrayList;
import java.util.List;

public class _0118_Pascals_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ArrayList<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        if (numRows < 1) {
            return result;
        }
        if (numRows == 1) {
            result.add(firstRow);
            return result;
        } else if(numRows == 2) {
            result.add(firstRow);
            result.add(secondRow);
            return result;
        } else {
            int hight = numRows - 2;
            result.add(firstRow);
            result.add(secondRow);
            while(hight > 0) {
                ArrayList<Integer> currentRow = new ArrayList<>();
                currentRow.add(1);
                List<Integer> lastRow = result.get(result.size() - 1);
                for (int i = 0 ; i < lastRow.size() - 1 ; i++) {
                    currentRow.add(lastRow.get(i) + lastRow.get(i + 1));
                }
                currentRow.add(1);
                result.add(currentRow);
                hight--;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(generate(0));
    }
}
