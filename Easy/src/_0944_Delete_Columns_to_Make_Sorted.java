public class _0944_Delete_Columns_to_Make_Sorted {
    public static int minDeletionSize(String[] strs) {
        int result = 0;
        for (int i = 0 ; i < strs[0].length() ; i++) {
            for (int j = 0 ; j < strs.length - 1 ; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs1 = {"cba", "daf", "ghi"};
        System.out.println(minDeletionSize(strs1));

        String[] strs2 = {"a", "b"};
        System.out.println(minDeletionSize(strs2));

        String[] strs3 = {"zyx", "wvu", "tsr"};
        System.out.println(minDeletionSize(strs3));
    }
}
