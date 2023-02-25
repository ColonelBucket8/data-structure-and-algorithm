// O(1) - Constant time
// O(n) - Linear time
public class ArrayTest {

    private static final int SIZE_OF_ELEMENT = 4;
    private static final int INITIAL_MEMORY = 12;
    public static final int[] INT_ARRAY = new int[]{20, 35, -15, 7, 55, 1, -22};

    public static void main() {
        int[] intArray = new int[7];
        int[] memAddress = new int[intArray.length];

        // O(1)
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int index = -1;
        // O(n)
        for (int i = 0; i < intArray.length; i++) {
            memAddress[i] = INITIAL_MEMORY + i * SIZE_OF_ELEMENT;
            System.out.println(memAddress[i]);
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }

        System.out.println("index = " + index);

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }
}