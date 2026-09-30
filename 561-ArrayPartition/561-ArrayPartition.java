// Last updated: 9/30/2026, 9:15:09 AM
1class Solution {
2    public int arrayPairSum(int[] nums) {
3        Arrays.sort(nums);
4        
5        int sum = 0;
6
7        for(int i=0;i<nums.length;i+=2){
8            sum += nums[i];
9        }
10        return sum;
11    }
12}