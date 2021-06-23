import java.util.Random;
import java.util.Arrays;
public class binary_search {
    public static void main(String[] args) {
        int[] array = new int[30];

        generateRandomNumbersAndSort(array);
        printArrayElements(array);
        binarySearch(array, 6);

    }

    public static void generateRandomNumbersAndSort(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            array[i] = rand.nextInt(100);
        }
        Arrays.sort(array);
    }

    public static void printArrayElements(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void binarySearch(int[] arr, int n) {
        int last = arr.length - 1;
        int first = 0;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < n) {
                first = mid + 1;
            } else if (arr[mid] == n) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}
