import java.util.Arrays;


// O(n^2)
public class BubbleSort {

    public static void main() {
        int[] intArray = ArrayTest.INT_ARRAY.clone();

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    ArrayTest.swap(intArray, i, i + 1);
                }
            }
        }

//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }
        System.out.println("Bubble Sort: " + Arrays.toString(intArray));
    }

}
