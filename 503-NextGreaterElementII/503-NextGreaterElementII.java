// Last updated: 9/11/2026, 9:34:52 AM
1
2class Solution {
3    public int[] nextGreaterElements(int[] nums) {
4        int n = nums.length;
5        int[] ans = new int[n];
6        java.util.Arrays.fill(ans, -1);
7
8        java.util.Stack<Integer> st = new java.util.Stack<>();
9
10        for (int i = 0; i < 2 * n; i++) {
11            int x = nums[i % n];
12
13            while (!st.isEmpty() && nums[st.peek()] < x)
14                ans[st.pop()] = x;
15
16            if (i < n)
17                st.push(i);
18        }
19
20        return ans;
21    }
22}
23