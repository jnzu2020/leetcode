import java.util.ArrayList;
import java.util.List;

public class _0401_Binary_Watch {
    public static List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        for (int hour = 0 ; hour < 12 ; hour++) {
            for (int minute = 0 ; minute < 60 ; minute++) {
                String hourStr = Integer.toBinaryString(hour);
                String minuteStr = Integer.toBinaryString(minute);
                if (countNumOfOne(hourStr) + countNumOfOne(minuteStr) == num) {
                    String str;
                    if (minute < 10) {
                        str = hour + ":0" + minute;
                    } else {
                        str = hour + ":" + minute;
                    }
                    result.add(str);
                }
            }
        }
        return result;
    }

    private static int countNumOfOne(String s) {
        int count = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(readBinaryWatch(n));
    }
}
