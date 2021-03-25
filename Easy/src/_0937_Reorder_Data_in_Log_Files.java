import java.util.Arrays;
import java.util.Comparator;

public class _0937_Reorder_Data_in_Log_Files {
    public static String[] reorderLogFiles(String[] logs) {
        Comparator<String> comparator = (o1, o2) -> {
            String[] log1 = o1.split(" ", 2);
            String[] log2 = o2.split(" ", 2);
            boolean isO1Let = !Character.isDigit(log1[1].charAt(0));
            boolean isO2Let = !Character.isDigit(log2[1].charAt(0));
            if (isO1Let && isO2Let) {
                int compare = log1[1].compareTo(log2[1]);
                if (compare != 0) {
                    return compare;
                } else {
                    return log1[0].compareTo(log2[0]);
                }
            }
            if (isO1Let) {
                return -1;
            }
            if (isO2Let) {
                return 1;
            }
            return 0;
        };
        Arrays.sort(logs, comparator);
        return logs;
    }

    public static void main(String[] args) {
        String[] logs1 = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        System.out.println(Arrays.toString(reorderLogFiles(logs1)));

        String[] logs2 = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
        System.out.println(Arrays.toString(reorderLogFiles(logs2)));
    }
}
