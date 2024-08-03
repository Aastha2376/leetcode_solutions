public class PlusOne66 {
    class Solution {
        public int[] plusOne(int[] digits) {
            int carry = 1;  // Initial carry is 1 because we are adding 1 to the number
            
            for (int i = digits.length - 1; i >= 0; i--) {
                int sum = digits[i] + carry;
                digits[i] = sum % 10;  // Update digit
                carry = sum / 10;      // Update carry
            }
            
            // If there is a carry left, we need to create a new array with an additional digit
            if (carry != 0) {
                int[] arr = new int[digits.length + 1];
                arr[0] = carry;
                for (int i = 0; i < digits.length; i++) {
                    arr[i + 1] = digits[i];
                }
                return arr;
            }
            
            return digits;
        }
    }
    
}
