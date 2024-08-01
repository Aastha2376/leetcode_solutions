public class PalindromeNumber09 {
    class Solution {
        public boolean isPalindrome(int x) {
            // remember teh negative condition
          if (x < 0) {
                return false;
            }
    
            long reversed = 0;
            long temp = x;
    
            while (temp != 0) {
                int digit = (int) (temp % 10);
                reversed = reversed * 10 + digit;
                temp /= 10;
            }
    
            return (reversed == x); 
        }
    }
    //To reverse a string WAY-1
    // public class ReverseString {
    //     public static void main(String[] args) {
    //         String original = "hello";
    //         String reversed = reverseString(original);
    //         System.out.println("Original: " + original);
    //         System.out.println("Reversed: " + reversed);
    //     }
    
    //     public static String reverseString(String s) {
    //         String reversed = ""; // Start with an empty string
    //         for (int i = s.length() - 1; i >= 0; i--) { // Iterate backwards through the original string
    //             reversed += s.charAt(i); // Add each character to the reversed string
    //         }
    //         return reversed; // Return the reversed string
    //     }
    // }
    
    //WAY 2
    // public class ReverseString {
    //     public static void main(String[] args) {
    //         String original = "hello";
    //         String reversed = reverseString(original);
    //         System.out.println("Original: " + original);
    //         System.out.println("Reversed: " + reversed);
    //     }
    
    //     public static String reverseString(String s) {
    //         String reversed = ""; // Start with an empty string
    //         for (int i = s.length() - 1; i >= 0; i--) { // Iterate backwards through the original string
    //             reversed += s.charAt(i); // Add each character to the reversed string
    //         }
    //         return reversed; // Return the reversed string
    //     }
    // }
    
    
}
