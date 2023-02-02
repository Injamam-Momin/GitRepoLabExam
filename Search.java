import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; ++i) {
            System.out.print("Enter element no. " + (i+1) +  " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched ");
        int searchElement = sc.nextInt();
        // int index = Search.LSearch(arr, searchElement
        int index = Search.BSearch(arr, searchElement, 0, arr.length - 1);
        if (index == -1) {
            System.out.println("Element " + searchElement + " Not found..!");
        } else {
            System.out.println("Element " + searchElement + " found at index : " + index);
        }
    }
}