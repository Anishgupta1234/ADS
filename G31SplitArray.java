public class G31SplitArray {

    public static boolean canSplit(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            if (leftSum == totalSum - leftSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};

        boolean result = canSplit(arr);
        System.out.println(result);
    }
}