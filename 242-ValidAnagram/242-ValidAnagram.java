// Last updated: 8/12/2026, 11:16:06 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqA = new int[26];
        int[] freqB = new int[26];
        for(char c : s.toCharArray())
          freqA[c-97]++;
        for(char c : t.toCharArray())
           freqB[c-97]++;
        return Arrays.equals(freqA,freqB); 
    }
}