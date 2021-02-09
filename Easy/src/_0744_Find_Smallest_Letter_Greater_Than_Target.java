public class _0744_Find_Smallest_Letter_Greater_Than_Target {
    public static char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target) {
                return letter;
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target1 = 'a';
        System.out.println(nextGreatestLetter(letters, target1));

        char target2 = 'c';
        System.out.println(nextGreatestLetter(letters, target2));

        char target3 = 'd';
        System.out.println(nextGreatestLetter(letters, target3));

        char target4 = 'g';
        System.out.println(nextGreatestLetter(letters, target4));

        char target5 = 'j';
        System.out.println(nextGreatestLetter(letters, target5));

        char target6 = 'k';
        System.out.println(nextGreatestLetter(letters, target6));
    }
}
