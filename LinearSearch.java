public class LinearSearch {

    public static int search(int arr[], int searchElement) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int searchElement = 9;
        int index = LinearSearch.search(arr, searchElement);
        if (index == -1) {
            System.out.println("Element " + searchElement + " Not found..!");
        } else {
            System.out.println("Element " + searchElement + " found at index : " + index);
        }
    }
}