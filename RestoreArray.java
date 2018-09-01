import java.util.Arrays;
import java.util.Scanner;

public class RestoreArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Array length: ");
        int arrayLength = in.nextInt();
        System.out.print("Numbers: ");
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        int[] result = changeNegative(numbers);
        System.out.println("Output" + Arrays.toString(result));
    }

    private static int[] changeNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i - 1] > array[i + 1]) {
                array[i] = array[i - 1] - 1;
            }
            if (array[i] < 0 && array[i - 1] < array[i + 1]) {
                array[i] = array[i - 1] + 1;
            }
        }
        return array;
    }
}
