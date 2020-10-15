import java.util.Arrays;

public class _0167_Two_Sum_II_Input_array_is_sorted {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers == null || numbers.length == 0) {
            return result;
        }

        for (int i = 0 ; i < numbers.length ; i++) {
            for (int j = i + 1 ; j < numbers.length ; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = (i + 1);
                    result[1] = (j + 1);
                    return result;
                } else if (numbers[i] + numbers[j] > target) {
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers1 = {2,7,11,15};
        int target1 = 9;
        System.out.println(Arrays.toString(twoSum(numbers1, target1)));

        int[] numbers2 = {2,3,4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(numbers2, target2)));

        int[] numbers3 = {-1,0};
        int target3 = -1;
        System.out.println(Arrays.toString(twoSum(numbers3, target3)));

        int[] numbers4 = {1,2,3,4,4,9,56,90};
        int target4 = 8;
        System.out.println(Arrays.toString(twoSum(numbers4, target4)));
    }
}
