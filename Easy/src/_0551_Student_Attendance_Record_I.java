public class _0551_Student_Attendance_Record_I {
    public static boolean checkRecord(String s) {
        char[] sChar = s.toCharArray();
        int numOfA = 0;
        for (int i = 0 ; i < sChar.length ; i++) {
            char c = sChar[i];
            if (c == 'A') {
                numOfA++;
                if (numOfA > 1) {
                    return false;
                }
            } else if (c == 'L') {
                if ((i + 1 < sChar.length) && (sChar[i + 1] == 'L')) {
                    if ((i + 2 < sChar.length) && (sChar[i + 2] == 'L')) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "PPALLP";
        System.out.println(checkRecord(s1));

        String s2 = "PPALLL";
        System.out.println(checkRecord(s2));
    }
}
