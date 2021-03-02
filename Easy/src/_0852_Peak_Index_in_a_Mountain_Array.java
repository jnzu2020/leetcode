public class _0852_Peak_Index_in_a_Mountain_Array {
    public static int peakIndexInMountainArray(int[] arr) {
        int index = 0;
        for (int i = 1 ; i < arr.length ; i++) {
            if (arr[i] > arr[i - 1]) {
                index = i;
            } else {
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0};
        System.out.println(peakIndexInMountainArray(arr1));

        int[] arr2 = {0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr2));

        int[] arr3 = {0, 10, 5, 2};
        System.out.println(peakIndexInMountainArray(arr3));

        int[] arr4 = {3, 4, 5, 1};
        System.out.println(peakIndexInMountainArray(arr4));

        int[] arr5 = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        System.out.println(peakIndexInMountainArray(arr5));
    }
}
