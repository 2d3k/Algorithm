import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.print(largestProductOfThree(new int[]{-1, 2, -5, 7}));
    }

    public static int largestProductOfThree(int[] arr) {
        Arrays.sort(arr);

        int result = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
        int minus_result = arr[arr.length - 1] * arr[0] * arr[1];

        return Math.max(result, minus_result);
    }
}
