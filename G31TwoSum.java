public class G31TwoSum {
    public static void main(String[] args) {

        // array = [1,2,3,4,6]
        // target = 6

        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;

        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (found) {
            System.out.println("Pair found at indices: " + left + " and " + right);
            System.out.println("Values are: " + arr[left] + " + " + arr[right]);
        } else {
            System.out.println("No pair found");
        }
    }
}