// Last updated: 9/11/2026, 9:36:01 AM
1
2public class Solution extends VersionControl {
3    public int firstBadVersion(int n) {
4        int left = 1, right = n;
5
6        while (left < right) {
7            int mid = left + (right - left) / 2;
8
9            if (isBadVersion(mid))
10                right = mid;
11            else
12                left = mid + 1;
13        }
14
15        return left;
16    }
17}
18
19