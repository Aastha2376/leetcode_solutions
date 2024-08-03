public class LengthofLastWord58 {
    class Solution {
        public int lengthOfLastWord(String s) {
            int a = 0;
            int i = s.length() - 1;
            
            // Skip trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
    
            // Count the length of the last word
            for (; i >= 0; i--) {
                if (s.charAt(i) == ' ') {
                    break;
                }
                a++;
            }
            
            return a;
        }
    }
    
}
