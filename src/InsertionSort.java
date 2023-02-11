import java.util.Arrays;

public class InsertionSort {
    public static void main() {
        int[] intArray = ArrayTest.INT_ARRAY.clone();

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        System.out.println("Insertion Sort: " + Arrays.toString(intArray));

    }
}
