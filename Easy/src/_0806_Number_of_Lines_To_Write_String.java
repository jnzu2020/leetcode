import java.util.Arrays;

public class _0806_Number_of_Lines_To_Write_String {
    public static int[] numberOfLines(int[] widths, String s) {
        int numOfLine = 1;
        int widthOfLastLine = 0;
        for (char c : s.toCharArray()) {
            widthOfLastLine += widths[c - 'a'];
            if (widthOfLastLine > 100) {
                numOfLine++;
                widthOfLastLine = widths[c - 'a'];
            }
        }
        return new int[]{numOfLine, widthOfLastLine};
    }

    public static void main(String[] args) {
        int[] widths1 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                10, 10, 10, 10, 10, 10, 10};
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(Arrays.toString(numberOfLines(widths1, s1)));

        int[] widths2 = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                10, 10, 10, 10, 10, 10, 10};
        String s2 = "bbbcccdddaaa";
        System.out.println(Arrays.toString(numberOfLines(widths2, s2)));
    }
}
