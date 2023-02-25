import java.util.Arrays;

public class ShellSort {
    public static void main() {
        int[] intArray = ArrayTest.INT_ARRAY.clone();

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                // Swap if new element is smaller than gap element
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                // else do nothing
                intArray[j] = newElement;
            }
        }

        System.out.println("Shell Sort: " + Arrays.toString(intArray));

    }
}
