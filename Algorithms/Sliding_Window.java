package leetcode_solutions.Algorithms;

public class Sliding_Window {
    public class SlidingWindowExample {

        public static int maxSumSubarrayOfSizeK(int[] arr, int k) {
            if (arr.length < k) {
                System.out.println("Invalid input: Array length is less than k");
                return -1;
            }
    
            int maxSum = 0;
            int windowSum = 0;
    
            // Compute the sum of the first window of size k
            for (int i = 0; i < k; i++) {
                windowSum += arr[i];
            }
    
            maxSum = windowSum;
    
            // Slide the window across the array
            for (int i = k; i < arr.length; i++) {
                // Slide the window: subtract the element going out and add the element coming in
                windowSum += arr[i] - arr[i - k];
                maxSum = Math.max(maxSum, windowSum);
            }
    
            return maxSum;
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 1, 5, 1, 3, 2};
            int k = 3;
            int maxSum = maxSumSubarrayOfSizeK(arr, k);
    
            System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSum);
        }
    }
    
}
