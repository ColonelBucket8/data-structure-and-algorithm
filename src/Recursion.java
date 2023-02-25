public class Recursion {
    private static final int numTest = 3;

    public static void main() {
        System.out.println("Recursion");
        System.out.println(iterativeFactorial(numTest));
        System.out.println(recursiveFactorial(numTest));

    }

    @SuppressWarnings("SameParameterValue")
    private static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    private static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }
}
