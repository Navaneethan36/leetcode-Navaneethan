// Last updated: 8/12/2026, 11:15:34 AM
class Solution {
    public int firstUniqChar(String s) {
        // Since we only have 'a'-'z', an array of size 26 is perfect
        int[] count = new int[26];
        int n = s.length();
        
        // First pass: Build the frequency map
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        // Second pass: Find the first character with a count of 1
        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}