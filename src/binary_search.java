import java.util.Random;
import java.util.Arrays;
public class binary_search {
    public static void main(String[] args) {

        //inializes an array of 30 integer numbers
        int[] array = new int[30];

        // adds randomly generated integer numbers to array
        generateRandomNumbers(array);

        // sorts array elements in ascending order
        sortArrayElements(array);

        // searches for 5 in array
        binarySearch(array, 5);

    }

    // adds randomly generated integer numbers to an array
    public static void generateRandomNumbers(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            array[i] = rand.nextInt(100);
        }
    }

    // sorts array elements in ascending order
    public static void sortArrayElements(int[] array) {
        Arrays.sort(array);
        for (int element : array) {
            System.out.println(element);
        }
    }

    // searchs for integer n in the integer array
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
