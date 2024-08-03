public class FirstOccurrenceString28 {
    class Solution {
        //very effiecient and easy solution
        public int strStr(String haystack, String needle) {
             if(haystack.contains(needle)){
                return haystack.indexOf(needle);
            }
        return -1;
            
        }
    }
    //Brute force
    
    // class Solution {
    //     public int strStr(String haystack, String needle) {
    //         if (needle.length() == 0) return 0;
    //         int s = 0;
    //haystack-needle length is imp
    //         for (int i = 0; i <= haystack.length() - needle.length(); i++) {
    //             if (haystack.charAt(i) == needle.charAt(s)) {
    //                 int d = s + 1;
    //                 int b = 1;
    
    //                 for (int a = i + 1; a < needle.length() + i; a++, d++) {
    //                     if (haystack.charAt(a) != needle.charAt(d)) {
    //                         b = 0;
    //                         break;
    //                     }
    //                 }
    
    //                 if (b == 1) {
    //                     return i;
    //                 }
    //             }
    //         }
    //         return -1;
    //     }
    // }
    
}
