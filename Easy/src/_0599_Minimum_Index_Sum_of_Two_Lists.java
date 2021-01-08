import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0599_Minimum_Index_Sum_of_Two_Lists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<>();
        for (int sumOfIndex = 0 ; sumOfIndex < list1.length + list2.length - 1 ; sumOfIndex++) {
            for (int i = 0 ; i < list1.length ; i++) {
                int j = sumOfIndex - i;
                if (j >= 0 && j < list2.length && list1[i].equals(list2[j])) {
                    result.add(list1[i]);
                }
            }
            if (!result.isEmpty()) {
                break;
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] list1_1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2_1 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(Arrays.toString(findRestaurant(list1_1, list2_1)));

        String[] list1_2 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2_2 = {"KFC", "Shogun", "Burger King"};
        System.out.println(Arrays.toString(findRestaurant(list1_2, list2_2)));

        String[] list1_3 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2_3 = {"KFC", "Burger King", "Tapioca Express", "Shogun"};
        System.out.println(Arrays.toString(findRestaurant(list1_3, list2_3)));

        String[] list1_4 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2_4 = {"KNN", "KFC", "Burger King", "Tapioca Express", "Shogun"};
        System.out.println(Arrays.toString(findRestaurant(list1_4, list2_4)));

        String[] list1_5 = {"KFC"};
        String[] list2_5 = {"KFC"};
        System.out.println(Arrays.toString(findRestaurant(list1_5, list2_5)));
    }
}
