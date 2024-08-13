package leetcode_solutions.HashMap;

import java.util.HashSet;

public class Happy_Number202 {
    class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set1 = new HashSet<>();

        while (!set1.contains(n)) {
            set1.add(n); // Add current value of n to the set to detect cycles
            int sum = 0; // Reset sum for each new number

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            if (sum == 1) {
                return true; // Happy number found
            } else {
                n = sum; // Continue with the new sum
            }
        }

        return false; // Cycle detected, so it's not a happy number
    
    }
}
}
