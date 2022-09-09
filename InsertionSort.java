import java.util.Arrays;

/** Implemantation of the Insertion Sort algorithm. */
public class InsertionSort {
    /** Execute Insertion Sort for an integer array. */
    public static void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j--];
            }
            arr[j + 1] = key;

            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int test[] = {2, 6, 3, 70, 14, 5, 16, 1};

        System.out.println(Arrays.toString(test) + '\n');
        sort(test);
        System.out.println("\nSorted Array: " + Arrays.toString(test));
    }
}
