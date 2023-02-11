import java.util.Arrays;

public class SelectionSort {
    public static void main() {
        int[] intArray = ArrayTest.INT_ARRAY.clone();

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
           ArrayTest.swap(intArray, largest, lastUnsortedIndex);
        }

        System.out.println("Selection Sort: " + Arrays.toString(intArray));

    }
}
