public class Search {

    public static int LSearch(int arr[], int searchElement) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }

    public static int BSearch(int arr[], int searchElement, int left, int right) {
        if (left < right) {
            int mid = left + right / 2;
            if (arr[mid] == searchElement)
                return mid;
            if (arr[mid] < searchElement)
                return BSearch(arr, searchElement, mid, right);
            if (arr[mid] > searchElement)
                return BSearch(arr, searchElement, left, mid);
        }

        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int searchElement = 9;
        int index = Search.LSearch(arr, searchElement);
        // index = Search.BSearch(arr, searchElement, 0, arr.length - 1);
        if (index == -1) {
            System.out.println("Element " + searchElement + " Not found..!");
        } else {
            System.out.println("Element " + searchElement + " found at index : " + index);
        }
    }
}