public class Main {
    public static boolean superIncreasing(int[] arr) {
        if(arr.length == 0) return false;
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= sum) {
                return false;
            }
            sum = sum + arr[i];
        }
        return true;
    }
}
