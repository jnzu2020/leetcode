public class _0035_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int num : nums) {
            if (num < target) {
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target1 = 5;
        System.out.println(searchInsert(nums, target1));

        int target2 = 2;
        System.out.println(searchInsert(nums, target2));

        int target3 = 7;
        System.out.println(searchInsert(nums, target3));

        int target4 = 0;
        System.out.println(searchInsert(nums, target4));
    }
}
