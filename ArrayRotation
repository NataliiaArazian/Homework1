# Homework1
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Array length: ");
        int arrayLength = in.nextInt();
        System.out.print("k: ");
        int k = in.nextInt();
        System.out.print("Numbers: ");
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

        int [] result = move(numbers, k);
        System.out.println("Output" + Arrays.toString(result));
    }

    private static int[] move(int[] array, int k) {
        int [] result = new int[array.length];
        int [] first = Arrays.copyOfRange(array, 0, k);
        int [] second = Arrays.copyOfRange(array, k, array.length);
        System.arraycopy(second, 0, result, 0, second.length);
        System.arraycopy(first, 0, result, result.length - k, first.length);
        return result;
    }
}
