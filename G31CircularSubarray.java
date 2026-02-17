class G31CircularSubarray {

    static int kadane(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    static int circularSubarraySum(int[] arr) {
        int normalMax = kadane(arr);

        if (normalMax < 0)
            return normalMax;

        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }

        int invertedMax = kadane(arr);
        int circularMax = totalSum + invertedMax;

        return Math.max(normalMax, circularMax);
    }

    public static void main(String[] args) {
        int[] arr = {8, -4, 3, -5, 4};

        int result = circularSubarraySum(arr);
        System.out.println("Maximum Circular Subarray Sum is: " + result);
    }
}