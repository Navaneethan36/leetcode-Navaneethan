// Last updated: 9/11/2026, 9:33:20 AM
1
2class Solution {
3    public String removeKdigits(String num, int k) {
4        StringBuilder s = new StringBuilder();
5
6        for (char c : num.toCharArray()) {
7            while (k > 0 && s.length() > 0 && s.charAt(s.length() - 1) > c) {
8                s.deleteCharAt(s.length() - 1);
9                k--;
10            }
11            s.append(c);
12        }
13
14        while (k-- > 0)
15            s.deleteCharAt(s.length() - 1);
16
17        int i = 0;
18        while (i < s.length() && s.charAt(i) == '0')
19            i++;
20
21        String ans = s.substring(i);
22        return ans.isEmpty() ? "0" : ans;
23    }
24}
25
26