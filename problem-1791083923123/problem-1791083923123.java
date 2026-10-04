// Last updated: 10/4/2026, 8:48:43 AM
1class Solution {
2    public int minRotations(String s) {
3        int ans = 0;
4        int current = 0 ;
5        for(char c :s.toCharArray()){
6            int target = c - '0';
7            int diff = Math.abs(current - target);
8            ans += Math.min(diff,10 - diff);
9            current = target;
10        }
11        return ans;
12    }
13}