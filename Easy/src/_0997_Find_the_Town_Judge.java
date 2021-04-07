public class _0997_Find_the_Town_Judge {
    public static int findJudge(int N, int[][] trust) {
        int[] arr = new int[N];

        for (int[] people : trust) {
            arr[people[0] - 1]--;
            arr[people[1] - 1]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == N - 1) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int N1 = 2;
        int[][] trust1 = {{1, 2}};
        System.out.println(findJudge(N1, trust1));

        int N2 = 3;
        int[][] trust2 = {{1, 3}, {2, 3}};
        System.out.println(findJudge(N2, trust2));

        int N3 = 3;
        int[][] trust3 = {{1, 3}, {2, 3}, {3, 1}};
        System.out.println(findJudge(N3, trust3));

        int N4 = 3;
        int[][] trust4 = {{1, 2}, {2, 3}};
        System.out.println(findJudge(N4, trust4));

        int N5 = 4;
        int[][] trust5 = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        System.out.println(findJudge(N5, trust5));
    }
}
