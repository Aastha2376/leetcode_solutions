package leetcode_solutions.Algorithms;

public class Sliding_window2 {
    public class SlidingWindowExample {

        public static int smallestSubarrayWithSum(int[] arr, int target) {
            int minLength = Integer.MAX_VALUE;
            int windowSum = 0;
            int windowStart = 0;
    
            // Slide the window across the array
            for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
                // Add the next element to the window
                windowSum += arr[windowEnd];
    
                // Shrink the window as small as possible while the sum is greater than or equal to the target
                while (windowSum >= target) {
                    minLength = Math.min(minLength, windowEnd - windowStart + 1);
                    windowSum -= arr[windowStart]; // Remove the element going out of the window
                    windowStart++; // Move the start of the window to the right
                }
            }
            // for equal to...
            // for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            //     windowSum += arr[windowEnd]; // Add the next element to the window
    
            //     // Check if the current window's sum equals the target
            //     while (windowSum >= target) {
            //         if (windowSum == target) {
            //             minLength = Math.min(minLength, windowEnd - windowStart + 1);
            //         }
            //         windowSum -= arr[windowStart]; // Remove the element going out of the window
            //         windowStart++; // Move the start of the window to the right
            //     }
            // }
    
            return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 1, 5, 2, 3, 2};
            int target = 7;
            int result = smallestSubarrayWithSum(arr, target);
    
            System.out.println("The length of the smallest subarray with a sum >= " + target + " is: " + result);
        }
    }
    
}
