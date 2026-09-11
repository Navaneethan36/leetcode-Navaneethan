// Last updated: 9/11/2026, 9:40:19 AM
1
2class Solution {
3    public boolean search(int[] nums, int target) {
4        int l = 0, r = nums.length - 1;
5
6        while (l <= r) {
7            int m = l + (r - l) / 2;
8
9            if (nums[m] == target)
10                return true;
11
12            if (nums[l] == nums[m] && nums[m] == nums[r]) {
13                l++;
14                r--;
15            }
16            else if (nums[l] <= nums[m]) { 
17                if (nums[l] <= target && target < nums[m])
18                    r = m - 1;
19                else
20                    l = m + 1;
21            }
22            else { 
23                if (nums[m] < target && target <= nums[r])
24                    l = m + 1;
25                else
26                    r = m - 1;
27            }
28        }
29
30        return false;
31    }
32}
33
34