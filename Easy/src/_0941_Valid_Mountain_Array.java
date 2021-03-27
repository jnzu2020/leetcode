public class _0941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int index = 0;
        while (index < arr.length - 1 && arr[index] < arr[index + 1]) {
            index++;
        }
        if (index == 0 || index == arr.length - 1) {
            return false;
        }
        while (index < arr.length - 1 && arr[index] > arr[index + 1]) {
            index++;
        }
        return index == arr.length - 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1};
        System.out.println(validMountainArray(arr1));

        int[] arr2 = {3, 5, 5};
        System.out.println(validMountainArray(arr2));

        int[] arr3 = {0, 3, 2, 1};
        System.out.println(validMountainArray(arr3));

        int[] arr4 = {2, 0, 2};
        System.out.println(validMountainArray(arr4));
    }
}
