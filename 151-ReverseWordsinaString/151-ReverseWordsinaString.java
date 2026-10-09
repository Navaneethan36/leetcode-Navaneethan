// Last updated: 10/9/2026, 10:01:29 AM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.trim().split("\\s+");
4        String ans = "";
5
6        for (int i = words.length - 1; i >= 0; i--) {
7            ans += words[i] + " ";
8        }
9
10        return ans.trim();
11    }
12}