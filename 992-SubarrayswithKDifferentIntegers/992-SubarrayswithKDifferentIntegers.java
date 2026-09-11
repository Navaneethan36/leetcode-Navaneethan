// Last updated: 9/11/2026, 9:31:34 AM
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        return atMost(nums, k) - atMost(nums, k - 1);
4    }
5
6    private int atMost(int[] nums, int k) {
7        int[] freq = new int[nums.length + 1];
8        int left = 0, count = 0, ans = 0;
9
10        for (int right = 0; right < nums.length; right++) {
11            if (freq[nums[right]]++ == 0)
12                count++;
13
14            while (count > k) {
15                if (--freq[nums[left++]] == 0)
16                    count--;
17            }
18
19            ans += right - left + 1;
20        }
21
22        return ans;
23    }
24}
25