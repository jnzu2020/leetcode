import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _0001_Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        // change the array to a HashMap
        for (int i = 0 ; i < nums.length ; i++) {
            numsMap.put(i, nums[i]);
        }

        int[] result = new int[2];

        for (int i = 0 ; i < nums.length ; i++) {
            numsMap.remove(i);
            int rest = target - nums[i];
            if (numsMap.containsValue(rest)) {
                result[0] = i;
                result[1] = getKeyOfValueInMap(numsMap, rest);
                break;
            }
            numsMap.put(i, nums[i]);
        }
        return result;
    }

    /**
     * get the key of a value in a Map
     * @param map The map
     * @param value The value of the key
     * @return result The key
     */
    private static int getKeyOfValueInMap(Map<Integer, Integer> map, int value) {
        int result = 0;
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for(Map.Entry<Integer, Integer> entry : set){
            if(entry.getValue() == value){
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println(Arrays.toString(twoSum(input1, target1)));

        int[] input2 = {3,2,4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(input2, target2)));

        int[] input3= {3,3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(input3, target3)));
    }
}
