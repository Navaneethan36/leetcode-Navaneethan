// Last updated: 10/7/2026, 8:35:53 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4
5        int n = nums.length;
6        return Math.max(nums[0]*nums[1]*nums[n-1],
7        nums[n-1]*nums[n-2]*nums[n-3]);
8    }
9}