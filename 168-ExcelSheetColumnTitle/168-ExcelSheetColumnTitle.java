// Last updated: 9/11/2026, 9:29:37 AM
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder s = new StringBuilder();
4
5        while (columnNumber > 0) {
6            columnNumber--;
7            s.append((char)('A' + columnNumber % 26));
8            columnNumber /= 26;
9        }
10
11        return s.reverse().toString();
12    }
13}